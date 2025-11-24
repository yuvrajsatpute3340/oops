package Static_Variable;

class BankAccount {

    static double interestRate = 4.5;   
    String holderName;
    double balance;

    BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println(holderName + " | Balance: " + balance + " | Interest Rate: " + interestRate);
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Rohit", 5000);
        BankAccount a2 = new BankAccount("Sneha", 12000);

        a1.showDetails();
        a2.showDetails();
        BankAccount.interestRate = 5.0;

        System.out.println("\nAfter interest rate change:");
        a1.showDetails();
        a2.showDetails();
    }
}
