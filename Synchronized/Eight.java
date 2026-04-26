package Synchronized;

public class Eight {

    public static void main(String[] args) throws Exception {

        Account account = new Account();

        WithdrawThread t1 = new WithdrawThread();
        WithdrawThread t2 = new WithdrawThread();

        t1.account = account;
        t2.account = account;

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}

// Shared Resource
class Account {
    int balance = 1000;

    // synchronized method
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Thread Class
class WithdrawThread extends Thread {
    Account account;

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(300);
        }
    }
}