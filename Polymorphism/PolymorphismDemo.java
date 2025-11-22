package Polymorphism;
class Shape {
 public void area() {
     System.out.println("Area of Shape");
 }
}
class Circle extends Shape {
 public void area() {
     double r = 5;
     double result = 3.14 * r * r;
     System.out.println("Area of Circle: " + result);
 }
}
class Rectangle extends Shape {
 public void area() {
     int l = 10, b = 5;
     int result = l * b;
     System.out.println("Area of Rectangle: " + result);
 }
}

public class PolymorphismDemo {

 public static void main(String[] args) {

     Shape s;

     s = new Circle();      
     s.area();              

     s = new Rectangle();   
     s.area();              
}
}

