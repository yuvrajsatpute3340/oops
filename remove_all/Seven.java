package remove_all;

import java.util.ArrayList;
import java.util.List;

public class Seven {
    public static void main(String[] args) {
        List<String> fruitsBasket = new ArrayList<>();
        fruitsBasket.add("Apple");
        fruitsBasket.add("Banana");
        fruitsBasket.add("Mango");
        fruitsBasket.add("Orange");

        List<String> fruitsToRemove = new ArrayList<>();
        fruitsToRemove.add("Banana");
        fruitsToRemove.add("Orange");

        // Remove all elements in fruitsToRemove from fruitsBasket
        fruitsBasket.removeAll(fruitsToRemove);

        System.out.println(fruitsBasket); // Output: [Apple, Mango]
    }
}