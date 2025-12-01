package Inheritance;

import Class_demo.Dog;

class Vehicle1 {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class car extends Vehicle1 {
    void ride() {
        System.out.println("Bike is being ridden...");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {

        car b = new car();   
        b.start();  
        b.ride();       }
}
