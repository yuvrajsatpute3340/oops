package pop_method;

import java.util.Stack;

public class Third {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        while (!numbers.isEmpty()) {
            System.out.println("Popped: " + numbers.pop());
        }
        // Output:
        // Popped: 3
        // Popped: 2
        // Popped: 1
    }
}
