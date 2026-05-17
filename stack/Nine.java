package stack;

import java.util.Stack;

public class Nine {
    public static void main(String[] args) {

        Stack<Integer> marks = new Stack<>();

        marks.add(67);
        marks.add(78);
        marks.add(89);
        marks.add(91);
        marks.add(55);

        System.out.println("Removed Marks: " + marks.remove(4));
        System.out.println("Marks Stack: " + marks);
        System.out.println("Top Marks: " + marks.peek());
    }
}