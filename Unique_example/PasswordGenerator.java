package Unique_example;

import java.util.Random;

public class PasswordGenerator {
    static String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";

    public static String generatePassword(int length) {
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < length; i++) {
            pass.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return pass.toString();
    }

    public static void main(String[] args) {
        System.out.println("Password: " + generatePassword(10));
    }
}