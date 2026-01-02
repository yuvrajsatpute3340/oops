package linkedhash_set;

import java.util.HashSet;

public class Fourth {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); 

        System.out.println(fruits);

        System.out.println(fruits.contains("Banana")); 
        fruits.remove("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
