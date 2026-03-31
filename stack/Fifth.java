package stack;

import java.util.Stack;

public class Fifth {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);
        stack.add(500);

        System.out.println("Removed (index 2): " + stack.remove(2)); // removes 300
        System.out.println("Stack now: " + stack);
        System.out.println("Top element: " + stack.peek());
    }
}
