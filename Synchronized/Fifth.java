package Synchronized;

public class Fifth {

    public static void main(String[] args) throws InterruptedException {

        Counter count = new Counter();

        FirstThread first = new FirstThread(count);
        SecondThread second = new SecondThread(count);

        first.start();
        second.start();

        // wait for both threads to finish
       // first.join();
        //second.join();
        
        Thread.sleep(1000);

        System.out.println(count.getCount());
    }
}

class Counter {
     int counter = 0;

    // synchronized to avoid race condition
    public void increase() {
        counter++;
    }

    public int getCount() {
        return counter;
    }
}

class FirstThread extends Thread {
     Counter count;

    // constructor
    public FirstThread(Counter count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.increase();
        }
    }
}

class SecondThread extends Thread {
     Counter count;

    // constructor
    public SecondThread(Counter count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.increase();
        }
    }
}