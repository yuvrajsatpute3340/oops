package Practic_logical_prg;

//---- Abstraction ----
abstract class Vehicle {
 abstract void start(); // abstract method
}

//---- Inheritance ----
class Car extends Vehicle {
 @Override
 void start() {
     System.out.println("Car Started...");
 }
}

//---- Encapsulation ----
class Student {
 private String name;   // private variable
 private int roll;

 // ---- Constructor ----
 public Student(String name, int roll) {
     this.name = name;
     this.roll = roll;
 }

 // getter methods
 public String getName() { return name; }
 public int getRoll() { return roll; }
}

//---- Contract (equals + hashCode) ----
class College {
 String cname;
 int cid;

 public College(String cname, int cid) {
     this.cname = cname;
     this.cid = cid;
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;            // Reflexive
     if (obj == null) return false;
     if (getClass() != obj.getClass()) return false;

     College c = (College) obj;
     return this.cid == c.cid && this.cname.equals(c.cname);
 }

 @Override
 public int hashCode() {
     return cname.hashCode() + cid;
 }
}

//---- Polymorphism ----
class Shape {
 void draw() {
     System.out.println("Drawing Shape...");
 }
}

class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing Circle...");
 }
}

//---- Main Class ----
public class AllConcepts {

 // ---- Static Variable ----
 static int count = 0;

 public static void main(String[] args) {

     // Constructor + Encapsulation
     Student s1 = new Student("Rahul", 10);
     System.out.println("Student Name: " + s1.getName());
     System.out.println("Roll No: " + s1.getRoll());

     // Inheritance + Abstraction
     Vehicle car = new Car();
     car.start();

     // ---- Array ----
     int[] marks = {45, 67, 89, 55};

     // ---- Loops ----
     System.out.println("Marks:");
     for (int m : marks) {
         System.out.println(m);
     }

     // ---- Conditional ----
     if (marks[0] > 40) {
         System.out.println("Pass");
     } else {
         System.out.println("Fail");
     }

     // ---- Polymorphism ----
     Shape shape = new Circle();
     shape.draw();

     // ---- String Example ----
     String msg = "Java is Awesome!";
     System.out.println(msg.toUpperCase());

     // ---- Static variable ----
     count++;
     System.out.println("Count value: " + count);

     // ---- Contract (equals) ----
     College c1 = new College("XYZ", 1);
     College c2 = new College("XYZ", 1);

     System.out.println("College Same? : " + c1.equals(c2)); // true

     // ---- Exception Handling + throw keyword ----
     try {
         checkAge(15);
     } catch (Exception e) {
         System.out.println("Exception Occurred: " + e.getMessage());
     }
 }

 // throw keyword + Exception
 public static void checkAge(int age) throws Exception {
     if (age < 18) {
         throw new Exception("Age is less than 18!");
     } else {
         System.out.println("Valid Age.");
     }
 }
}