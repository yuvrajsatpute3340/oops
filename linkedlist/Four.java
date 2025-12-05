package linkedlist;

import java.util.LinkedList;

public class Four {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("Start");
        list.addLast("End");

        System.out.println("LinkedList: " + list);

        list.removeFirst();   
        list.removeLast();    

        System.out.println("After removal: " + list);
    }
}

