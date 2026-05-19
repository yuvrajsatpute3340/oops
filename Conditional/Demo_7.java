package Conditional;

public class Demo_7 {

    public static void main(String[] args) {

        String course = "Java";
        double feesPaid = 5000;

        if (course.equals("Java") && feesPaid >= 5000)
        {
            System.out.println("Admission Confirmed");
        }
        else
        {
            System.out.println("Admission Pending");
        }
    }
}