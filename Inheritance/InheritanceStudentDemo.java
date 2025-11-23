package Inheritance;

class Student {
 protected String name;
 protected int rollNo;

 public Student(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }

 public void displayStudentInfo() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll No: " + rollNo);
 }
}

class Exam extends Student {
 protected int marks1;
 protected int marks2;
 protected int marks3;

 public Exam(String name, int rollNo, int marks1, int marks2, int marks3) {
     super(name, rollNo);
     this.marks1 = marks1;
     this.marks2 = marks2;
     this.marks3 = marks3;
 }

 public void displayMarks() {
     System.out.println("Marks in Subject 1: " + marks1);
     System.out.println("Marks in Subject 2: " + marks2);
     System.out.println("Marks in Subject 3: " + marks3);
 }
}

class Result extends Exam {
 public Result(String name, int rollNo, int marks1, int marks2, int marks3) {
     super(name, rollNo, marks1, marks2, marks3);
 }

 public void calculateResult() {
     int total = marks1 + marks2 + marks3;
     double percentage = total / 3.0;

     System.out.println("Total Marks: " + total);
     System.out.println("Percentage: " + percentage + "%");

     if (percentage >= 40) {
         System.out.println("Result: Pass");
     } else {
         System.out.println("Result: Fail");
     }
 }
}

public class InheritanceStudentDemo {
 public static void main(String[] args) {

     Result student1 = new Result("Alice", 101, 85, 78, 92);

     student1.displayStudentInfo();
     student1.displayMarks();
     student1.calculateResult();
 }
}
