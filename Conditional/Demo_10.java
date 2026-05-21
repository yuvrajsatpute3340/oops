package Conditional;

public class Demo_10 {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense)
        {
            System.out.println("You Can Drive a Car");
        }
        else
        {
            System.out.println("You Cannot Drive a Car");
        }
    }
}