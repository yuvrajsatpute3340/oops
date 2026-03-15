package stack;

import java.util.Stack;

public class Third {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println(stack.remove(4)); 
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}