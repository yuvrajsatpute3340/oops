package pop_method;

import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();

        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Mango");

        System.out.println("Removed: " + fruits.pop());  // Mango
        System.out.println("Stack Now: " + fruits);       // [Apple, Banana]
    }
}

