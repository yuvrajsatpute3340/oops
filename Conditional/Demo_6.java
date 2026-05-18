package Conditional;
public class Demo_6 {

    public static void main(String[] args) {

        String ticketType = "VIP";
        int age = 25;

        if (ticketType.equals("VIP") && age >= 18)
        {
            System.out.println("Entry Allowed to Concert");
        }
        else
        {
            System.out.println("Entry Not Allowed");
        }
    }
}