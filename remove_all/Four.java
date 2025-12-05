package remove_all;

import java.util.LinkedList;

public class Four {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Banana");   

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Banana");
        list2.add("Cherry");

        System.out.println("List1 before removeAll: " + list1);
        System.out.println("List2 elements to remove: " + list2);

        list1.removeAll(list2);

        System.out.println("List1 after removeAll: " + list1);
    }
}
