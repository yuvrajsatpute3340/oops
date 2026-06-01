package Encapsulation;

public class WalletApp {
    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        wallet.setAmount(5000);
        System.out.println("Amount: " + wallet.getAmount());
    }
}

class Wallet {

    private double amount;

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public double getAmount() {
        return amount;
    }
}