package removemethod;

import java.util.ArrayList;
import java.util.List;

public class Eleven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.removeIf(n -> n > 5);

        System.out.println(numbers); // [1, 2, 3, 4, 5]
    }
}