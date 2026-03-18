package remove_all;

import java.util.ArrayList;
import java.util.List;

public class Six {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(40);

        // Remove all elements in list2 from list1
        list1.removeAll(list2);

        System.out.println(list1); // Output: [10, 30]
    }
}