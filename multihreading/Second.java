package multihreading;

public class Second {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 100; i++) {
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
