package throwkeyword;

import java.util.Scanner;
class WeakPasswordException extends Exception {
 public WeakPasswordException(String message) {
     super(message);
 }
}

public class Fifth {
 public static void validatePassword(String password) throws WeakPasswordException {
     if (password.length() < 6) {
         throw new WeakPasswordException("Password too short! Minimum 6 characters required.");
     }
     if (!password.matches(".*[A-Z].*")) {
         throw new WeakPasswordException("Password must contain at least one uppercase letter.");
     }
     if (!password.matches(".*[0-9].*")) {
         throw new WeakPasswordException("Password must contain at least one number.");
     }

     System.out.println("Password is strong and valid!");
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter your password: ");
         String password = sc.nextLine();

         validatePassword(password);   

     } 
     catch (WeakPasswordException e) {
         System.out.println("Error: " + e.getMessage());
     }
     finally {
         System.out.println("Password checking completed.");
         sc.close();
     }
 }
}
