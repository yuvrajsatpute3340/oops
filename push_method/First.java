package push_method;

import java.util.Stack;

public class First {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);   // Output: [10, 20, 30]
    }
}
