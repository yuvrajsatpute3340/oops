package Conditional;

public class Demo_5 {

    public static void main(String[] args) {

        String email = "student@gmail.com";
        String otp = "5678";

        if (email.equals("student@gmail.com") && otp.equals("5678"))
        {
            System.out.println("Verification Successful");
        }
        else
        {
            System.out.println("Invalid Email or OTP");
        }
    }
}