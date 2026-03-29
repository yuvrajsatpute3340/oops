package reflection;

import java.lang.reflect.Constructor;

public class Seven {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("reflection.Book");

        // सर्व constructors list करणे
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor<?> con : constructors) {
            System.out.println("Constructor: " + con.getName());
            System.out.println("Parameters: " + con.getParameterCount());
        }
        Constructor<?> bookCons = c.getDeclaredConstructor(String.class, double.class);
        bookCons.setAccessible(true);

        Book b = (Book) bookCons.newInstance("Java Guide", 599.99);
        System.out.println("Book Title: " + b.title + ", Price: " + b.price);
    }
}

class Book {
    String title;
    double price;

    private Book(String title, double price) {
        this.title = title;
        this.price = price;
        System.out.println("Book object created via private constructor");
    }
}