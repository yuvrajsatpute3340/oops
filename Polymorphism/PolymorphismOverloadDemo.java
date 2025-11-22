package Polymorphism;

class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }
    public double calculate(double a, double b) {
        return a + b;
    }
}

public class PolymorphismOverloadDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.calculate(10, 20));
        System.out.println("Sum of 3 integers: " + calc.calculate(5, 15, 25));
        System.out.println("Sum of 2 doubles: " + calc.calculate(3.5, 4.8));
    }
}

