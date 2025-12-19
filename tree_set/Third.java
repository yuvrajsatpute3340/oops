package tree_set;

import java.util.TreeSet;

public class Third {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);

        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        numbers.remove(15);

        System.out.println("After removing 15:");
        System.out.println(numbers);
    }
}
