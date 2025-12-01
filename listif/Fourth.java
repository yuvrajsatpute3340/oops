package listif;

import java.util.ArrayList;
import java.util.List;

public class Fourth {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println("Numbers in List:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Second number: " + numbers.get(1));

        numbers.remove(0);

        System.out.println("After removing first number: " + numbers);
    }
}
