package stack;

import java.util.Stack;

public class Six {
    public static void main(String[] args) {

        Stack<Integer> students = new Stack<>();

        students.add(101);
        students.add(102);
        students.add(103);
        students.add(104);
        students.add(105);

        System.out.println("Removed Roll No: " + students.remove(1));
        System.out.println("Students Stack: " + students);
        System.out.println("Top Student: " + students.peek());
    }
}