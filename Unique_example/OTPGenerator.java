package Unique_example;

import java.util.Random;

public class OTPGenerator {
    public static String generateOTP() {
        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000);
        return String.valueOf(otp);
    }

    public static void main(String[] args) {
        System.out.println("Your OTP: " + generateOTP());
    }
}