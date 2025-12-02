package removemethod;

import java.util.ArrayList;

public class Three {
    public static void main(String[] args) {
    	
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original List: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        fruits.remove(1);  
        System.out.println("After removing element at index 1: " + fruits);
    }
}
