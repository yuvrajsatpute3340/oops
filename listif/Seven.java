package listif;

import java.util.*;  

public class Seven {
    public static void main(String[] args) {
    	
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); 

        System.out.println("Fruits List: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Orange");
        System.out.println("After update: " + fruits);

        fruits.remove("Apple");
        System.out.println("After removal: " + fruits);

        System.out.println("Total fruits: " + fruits.size());

        if(fruits.contains("Mango")) {
            System.out.println("Mango is in the list");
        }
    }
}
