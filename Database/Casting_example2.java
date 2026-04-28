package Database;

public class Casting_example2 {

    public static void main(String[] args) {
        
        // Narrowing (Explicit Casting)
        double price = 199.99;
        System.out.println(price);
        
        int roundedPrice = (int) price; // decimal part removed
        System.out.println(roundedPrice);
        
        
        // Widening (Implicit Casting)
        int quantity = 5;
        System.out.println(quantity);
        
        double totalQuantity = quantity; // automatically converted
        System.out.println(totalQuantity);
    }
}