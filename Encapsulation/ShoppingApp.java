package Encapsulation;

public class ShoppingApp {
    public static void main(String[] args) {

        Product product = new Product();

        product.setPrice(999);
        System.out.println("Price: " + product.getPrice());
    }
}

class Product {

    private double price;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public double getPrice() {
        return price;
    }
}