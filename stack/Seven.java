package stack;

import java.util.Stack;

public class Seven {
    public static void main(String[] args) {

        Stack<Integer> books = new Stack<>();

        books.add(11);
        books.add(22);
        books.add(33);
        books.add(44);
        books.add(55);

        System.out.println("Removed Book ID: " + books.remove(3));
        System.out.println("Books Stack: " + books);
        System.out.println("Top Book ID: " + books.peek());
    }
}