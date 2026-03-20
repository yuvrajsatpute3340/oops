package pop_method;
import java.util.Stack;

public class Five {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');

        System.out.println("Popped: " + stack.pop());  // Output: D
        System.out.println("After one pop: " + stack); // [A, B, C]

        stack.pop();
        System.out.println("After second pop: " + stack); // [A, B]
    }
}
