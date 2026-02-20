package copying;

public class copy_constructor2 {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Alice", 5000);
        BankAccount b2 = new BankAccount(b1);

        System.out.println(b2.accountHolder + " " + b2.balance);

	}

}
class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double bal) {
        accountHolder = name;
        balance = bal;
    }

    // Copy Constructor
    BankAccount(BankAccount b) {
        accountHolder = b.accountHolder;
        balance = b.balance;
    }
}
