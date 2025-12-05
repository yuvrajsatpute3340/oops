package linkedlist;

import java.util.LinkedList;

public class Fifth {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Traversing the LinkedList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
