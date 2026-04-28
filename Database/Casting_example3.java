package Database;

public class Casting_example3 {

    public static void main(String[] args) {
        
        // Narrowing (Explicit Casting)
        double temperature = 36.78;
        System.out.println(temperature);
        
        int approxTemp = (int) temperature; // decimal removed
        System.out.println(approxTemp);
        
        
        // Widening (Implicit Casting)
        int days = 7;
        System.out.println(days);
        
        double totalDays = days; // automatically converted
        System.out.println(totalDays);
    }
}