package push_method;

import java.util.Stack;

public class Third {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            numbers.push(i);   // 1 ते 5 पर्यंत push
        }

        System.out.println(numbers);   // Output: [1, 2, 3, 4, 5]
    }
}

