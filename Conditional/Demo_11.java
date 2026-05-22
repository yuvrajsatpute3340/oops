package Conditional;

public class Demo_11 {

    public static void main(String[] args) {

        int marks = 78;
        boolean attendanceGood = true;

        if (marks >= 40 && attendanceGood)
        {
            System.out.println("You Passed the Exam");
        }
        else
        {
            System.out.println("You Failed the Exam");
        }
    }
}