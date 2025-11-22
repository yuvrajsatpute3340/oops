package throwkeyword;

import java.util.Scanner;
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

public class Fourth {
 public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance! Withdrawal denied.");
     }

     System.out.println("Withdrawal successful! Remaining balance: " + (balance - amount));
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter account balance: ");
         double balance = sc.nextDouble();

         System.out.print("Enter amount to withdraw: ");
         double amount = sc.nextDouble();

         withdraw(balance, amount);   

     } 
     catch (InsufficientBalanceException e) {
         System.out.println("Error: " + e.getMessage());
     }
     finally {
         System.out.println("Transaction completed.");
         sc.close();
     }
 }
}
