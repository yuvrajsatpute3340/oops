
package listif;

import java.util.*;

public class Nine {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Rahul");
        list.add("Sneha");
        list.addFirst("Amit"); 
        list.addLast("Priya"); 

        System.out.println("LinkedList: " + list);

        System.out.println("First element: " + list.get(0));

        list.removeFirst();
        list.removeLast();
        System.out.println("After removal: " + list);

        System.out.println("Size: " + list.size());
        System.out.println("Contains Sneha? " + list.contains("Sneha"));
    }
}
