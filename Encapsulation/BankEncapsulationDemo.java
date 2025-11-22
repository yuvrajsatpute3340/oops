package Encapsulation;
class BankAccount {

 private String accountHolder;
 private double balance;
 public void setAccountHolder(String name) {
     this.accountHolder = name;
 }
 public String getAccountHolder() {
     return accountHolder;
 }
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 // Withdraw money
 public void withdraw(double amount) {
     if (amount > 0) {
         if (amount <= balance) {
             balance -= amount;
             System.out.println("Withdrawn: " + amount);
         } else {
             System.out.println("Insufficient balance!");
         }
     } else {
         System.out.println("Invalid withdrawal amount!");
     }
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 public void displayAccountInfo() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Account Balance: " + balance);
 }
}

public class BankEncapsulationDemo {
 public static void main(String[] args) {

     BankAccount account = new BankAccount();

     account.setAccountHolder("John Doe");  
     account.deposit(5000);                 
     account.withdraw(1500);                
     account.withdraw(4000);               

     account.displayAccountInfo();         
 }
}
