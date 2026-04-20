package removemethod;

import java.util.ArrayList;
import java.util.List;

public class Ten {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println(numbers); // [2, 4, 6, 8, 10]
    }
}