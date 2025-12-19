package tree_set;

import java.util.TreeSet;

public class Second {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Ravi");
        names.add("Anil");
        names.add("Suresh");
        names.add("Anil"); // duplicate

        System.out.println("Names in sorted order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
