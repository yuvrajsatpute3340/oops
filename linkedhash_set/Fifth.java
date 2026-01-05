package linkedhash_set;

import java.util.LinkedHashSet;

public class Fifth {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); 
        numbers.add(40);

        System.out.println(numbers);
    }
}
