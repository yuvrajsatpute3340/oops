package sync;


public class Third {

    public static void main(String[] args) throws InterruptedException {

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        Worker t1 = new Worker(bank1);
        Worker t2 = new Worker(bank2);

        t1.start();
        t2.start();

        Thread.sleep(2500);

        System.out.println(bank1.getTotalTransactions());
        System.out.println(bank2.getTotalTransactions());
    }
}

class Bank {

    static int totalTransactions = 0;

    public void performTransaction() {
        synchronized (Bank.class) {
            totalTransactions++;
        }
    }

    public int getTotalTransactions() {
        return totalTransactions;
    }
}

class Worker extends Thread {

    Bank bank;

    public Worker(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            bank.performTransaction();
        }
    }
}