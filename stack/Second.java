package stack;

import java.util.Stack;

public class Second {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println(stack.pop());   // removes top element
        System.out.println(stack.peek());  // shows top element
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack);
    }
}
