package multihreading;

import java.util.ArrayList;
import java.util.List;

public class Four {
    public static void main(String[] args) {

        Source sr = new Source();

        Producer p = new Producer(sr);
        Consumer c1 = new Consumer(sr);
        Consumer c2 = new Consumer(sr);

        p.start();
        c1.start();
        c2.start();
    }
}

class Source {
    private List<Integer> list = new ArrayList<>();
    private int num = 1;
    private final int MAX_SIZE = 10;

    public synchronized void add() throws InterruptedException {
        while (list.size() == MAX_SIZE) {
            System.out.println("Buffer full... Producer waiting");
            wait();
        }

        list.add(num);
        System.out.println("Produced: " + num);
        num++;

        notifyAll(); // notify consumers
    }

    public synchronized void remove() throws InterruptedException {
        while (list.size() == 0) {
            System.out.println("Buffer empty... Consumer waiting");
            wait();
        }

        int rem = list.remove(0);
        System.out.println("Consumed: " + rem);

        notifyAll(); // notify producer
    }
}

class Producer extends Thread {
    private Source sr;

    Producer(Source sr) {
        this.sr = sr;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                sr.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Source sr;

    Consumer(Source sr) {
        this.sr = sr;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                sr.remove();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
