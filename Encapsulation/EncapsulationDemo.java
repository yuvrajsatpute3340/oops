package Encapsulation;
class Student {
 private String name;
 private int age;
 private double marks;

 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     if (age > 0) {             
         this.age = age;
     } else {
         System.out.println("Invalid age!");
     }
 }

 public void setMarks(double marks) {
     if (marks >= 0 && marks <= 100) {
         this.marks = marks;
     } else {
         System.out.println("Invalid marks!");
     }
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public double getMarks() {
     return marks;
 }

 public void displayInfo() {
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
     System.out.println("Student Marks: " + marks);
 }
}

public class EncapsulationDemo {
 public static void main(String[] args) {

     Student student = new Student();

     student.setName("Alice");
     student.setAge(20);
     student.setMarks(88.5);

     student.displayInfo();

     student.setAge(-5);      
     student.setMarks(120);   
 }
}
