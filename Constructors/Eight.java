package Constructors;

public class Eight {
    public static void main(String[] args) {
        Car c = new Car(850000);
        c.showDetails();
    }
}

class Car {
    double cost;

    public Car(double c) {
        cost = c;
        System.out.println("Car cost: " + c);
        System.out.println("Drive safely!");
    }

    public Car() {
        System.out.println("No-argument constructor...");
    }

    public Car(String name, char type, int year) {
        System.out.println("Car: " + name + " Type: " + type + " Year: " + year);
    }

    public void showDetails() {
        System.out.println("Total cost of car: " + cost);
    }
}