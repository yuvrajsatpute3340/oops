package stack;

import java.util.Stack;

public class Fourth {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println("Removed (pop): " + stack.pop());   // removes 50
        System.out.println("Top (peek): " + stack.peek());     // shows 40
        System.out.println("Stack now: " + stack);
    }
}