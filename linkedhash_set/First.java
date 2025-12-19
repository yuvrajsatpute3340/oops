package linkedhash_set;

import java.util.LinkedHashSet;

public class First {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate, will be ignored

        System.out.println("LinkedHashSet elements:");
        System.out.println(set);
    }
}
