package StringWorking;

public class Third {
    public static void main(String[] args) {

        Product[] arr = {
            new Product(101, 500.5),
            new Product(102, 1200.0),
            new Product(103, 750.75),
            new Product(104, 999.9),
        };

        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
    }
}

class Product {
    int id;
    double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }
}