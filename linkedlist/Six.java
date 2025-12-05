package linkedlist;

import java.util.LinkedList;

public class Six {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("John");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Second element: " + names.get(1));

        names.set(1, "Alicia");

        names.remove(2);

        System.out.println("Updated LinkedList: " + names);
    }
}
