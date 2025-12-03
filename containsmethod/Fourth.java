package containsmethod;

import java.util.HashSet;

public class Fourth {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        if (numbers.contains(20)) {
            System.out.println("20 exists in the set.");
        } else {
            System.out.println("20 does NOT exist.");
        }
    }
}
