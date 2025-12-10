package push_method;

import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Amit");
        names.push("Rahul");
        names.push("Sneha");

        System.out.println(names);   // Output: [Amit, Rahul, Sneha]
    }
}
