package pop_method;

import java.util.Stack;

public class Fourth {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Popped: " + stack.pop());  // Output: Cherry
        System.out.println("Stack: " + stack);         // [Apple, Banana]
    }
}
