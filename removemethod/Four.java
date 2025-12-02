package removemethod;

import java.util.ArrayList;

public class Four {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        numbers.remove(Integer.valueOf(30)); 
        System.out.println("After removing 30: " + numbers);

        numbers.remove(2); 
        System.out.println("After removing element at index 2: " + numbers);
    }
}
