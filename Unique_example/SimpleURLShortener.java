package Unique_example;

import java.util.HashMap;

public class SimpleURLShortener {

    private static HashMap<Integer, String> database = new HashMap<>();
    private static int idCounter = 1;

    // Shorten URL
    public static String shortenURL(String longURL) {
        database.put(idCounter, longURL);
        return "short.ly/" + idCounter++;  // simple short URL
    }

    // Get original URL
    public static String getOriginalURL(int id) {
        return database.getOrDefault(id, "URL not found!");
    }

    public static void main(String[] args) {

        String short1 = shortenURL("https://google.com");
        String short2 = shortenURL("https://github.com");

        System.out.println("Short URL 1: " + short1);
        System.out.println("Short URL 2: " + short2);

        // Extract ID manually (just for demo)
        System.out.println("Original URL 1: " + getOriginalURL(1));
        System.out.println("Original URL 2: " + getOriginalURL(2));
    }
}