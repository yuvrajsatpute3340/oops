package Constructors;

public class Seven {
    public static void main(String[] args) {
        Mobile m = new Mobile(15000);
        m.display();
    }
}

class Mobile {
    double price;

    public Mobile(double p) {
        price = p;
        System.out.println("Price entered: " + p);
        System.out.println("Welcome to Mobile Store!");
    }

    public Mobile() {
        System.out.println("Default constructor called...");
    }

    public Mobile(String brand, int modelNo) {
        System.out.println("Brand: " + brand + ", Model No: " + modelNo);
    }

    public void display() {
        System.out.println("Mobile price is: " + price);
    }
}