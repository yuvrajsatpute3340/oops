package Database;

public class Casting_example {

    public static void main(String[] args) {
        
        // Narrowing (Explicit Casting)
        double marks = 87.65;
        System.out.println(marks);
        
        int finalMarks = (int) marks; // decimal removed
        System.out.println(finalMarks);
        
        
        // Widening (Implicit Casting)
        int students = 40;
        System.out.println(students);
        
        double totalStudents = students; // automatically converted
        System.out.println(totalStudents);
    }
}