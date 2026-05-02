package Unique_example;

import java.util.*;

public class AdvancedURLShortener {

    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Map<String, URLData> database = new HashMap<>();
    private static long counter = 100000; // starting ID

    // Inner class to store metadata
    static class URLData {
        String originalUrl;
        long expiryTime;
        int clicks;

        URLData(String originalUrl, long expiryTime) {
            this.originalUrl = originalUrl;
            this.expiryTime = expiryTime;
            this.clicks = 0;
        }
    }

    // Convert number to Base62
    private static String encodeBase62(long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(BASE62.charAt((int)(num % 62)));
            num /= 62;
        }
        return sb.reverse().toString();
    }

    // Generate short URL
    public static String shortenURL(String longURL, String customAlias, int validMinutes) {
        String shortCode;

        if (customAlias != null && !customAlias.isEmpty()) {
            if (database.containsKey(customAlias)) {
                return "Alias already taken!";
            }
            shortCode = customAlias;
        } else {
            shortCode = encodeBase62(counter++);
        }

        long expiryTime = System.currentTimeMillis() + (validMinutes * 60 * 1000);
        database.put(shortCode, new URLData(longURL, expiryTime));

        return shortCode;
    }

    // Retrieve original URL
    public static String getOriginalURL(String shortCode) {
        URLData data = database.get(shortCode);

        if (data == null) {
            return "URL not found!";
        }

        if (System.currentTimeMillis() > data.expiryTime) {
            database.remove(shortCode);
            return "URL expired!";
        }

        data.clicks++;
        return data.originalUrl;
    }

    // Get analytics
    public static int getClickCount(String shortCode) {
        URLData data = database.get(shortCode);
        return (data != null) ? data.clicks : -1;
    }

    public static void main(String[] args) {
        // Normal shortening
        String short1 = shortenURL("https://example.com/very/long/url", null, 5);
        System.out.println("Short URL: " + short1);

        // Custom alias
        String short2 = shortenURL("https://google.com", "myGoogle", 10);
        System.out.println("Custom Short URL: " + short2);

        // Access URLs
        System.out.println("Original: " + getOriginalURL(short1));
        System.out.println("Original: " + getOriginalURL("myGoogle"));

        // Click tracking
        System.out.println("Clicks on " + short1 + ": " + getClickCount(short1));
    }
}
