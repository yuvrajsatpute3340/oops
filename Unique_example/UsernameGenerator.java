package Unique_example;

import java.util.Random;

public class UsernameGenerator {
    public static String generateUsername(String name) {
        Random rand = new Random();
        int num = rand.nextInt(1000);
        return name.toLowerCase() + "_" + num;
    }

    public static void main(String[] args) {
        System.out.println("Username: " + generateUsername("Amit"));
    }
}