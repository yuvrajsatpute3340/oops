package tree_set;

import java.util.TreeSet;

public class Fourth {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // duplicate

        System.out.println(numbers);
    }
}
