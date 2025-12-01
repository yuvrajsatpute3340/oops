package listif;

import java.util.ArrayList;
import java.util.List;

public class Six {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Fruit List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Banana");

        System.out.println("Updated Fruit List: " + fruits);
    }
}
