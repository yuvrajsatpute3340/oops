package sync;

public class Fourth {

    public static void main(String[] args) throws InterruptedException {

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        Transaction t1 = new Transaction(acc1);
        Transaction t2 = new Transaction(acc2);

        t1.start();
        t2.start();

        Thread.sleep(2500);

        System.out.println(acc1.getTotalTransactions());
        System.out.println(acc2.getTotalTransactions());
    }
}

class BankAccount {

    static int totalTransactions = 0;

    public void deposit() {
        synchronized (BankAccount.class) {
            totalTransactions++;
        }
    }

    public int getTotalTransactions() {
        return totalTransactions;
    }
}

class Transaction extends Thread {

    BankAccount account;

    public Transaction(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.deposit();
        }
    }
}