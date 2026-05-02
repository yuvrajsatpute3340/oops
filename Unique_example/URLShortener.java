package Unique_example;

import java.util.Random;

public class URLShortener {
    static String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateShortCode(int length) {
        Random rand = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            code.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return code.toString();
    }

    public static void main(String[] args) {
        System.out.println("Short URL Code: " + generateShortCode(6));
    }
}