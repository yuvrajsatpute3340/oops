package tree_set;

import java.util.TreeSet;

public class First {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10); // duplicate, ignored

        System.out.println("TreeSet elements:");
        System.out.println(set);
    }
}
