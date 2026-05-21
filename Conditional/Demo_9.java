package Conditional;

public class Demo_9 {

    public static void main(String[] args) {

        int attendance = 85;
        boolean feesPaid = true;

        if (attendance >= 75 && feesPaid)
        {
            System.out.println("Eligible for Exam");
        }
        else
        {
            System.out.println("Not Eligible for Exam");
        }
    }
}