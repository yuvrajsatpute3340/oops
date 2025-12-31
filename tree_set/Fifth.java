package tree_set;

import java.util.TreeSet;

public class Fifth {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("Banana");
        names.add("Apple");
        names.add("Mango");
        names.add("Apple"); // duplicate

        System.out.println(names);
    }
}

