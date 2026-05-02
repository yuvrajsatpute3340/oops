package Unique_example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class UniqueCodeGenerator {

    public static String generateUniqueCode(String name) {
        try {
            // Step 1: random UUID
            String uuid = UUID.randomUUID().toString();

            // Step 2: combine with name + timestamp
            String input = name + System.currentTimeMillis() + uuid;

            // Step 3: hash (SHA-256)
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());

            // Step 4: convert to hex
            StringBuilder hex = new StringBuilder();
            for (byte b : hash) {
                hex.append(String.format("%02x", b));
            }

            // Step 5: return short unique code (first 12 chars)
            return hex.toString().substring(0, 12);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String code1 = generateUniqueCode("Rahul");
        String code2 = generateUniqueCode("Rahul");

        System.out.println("Unique Code 1: " + code1);
        System.out.println("Unique Code 2: " + code2);
    }
}
