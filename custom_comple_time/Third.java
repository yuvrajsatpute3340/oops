package custom_comple_time;

public class Third {

    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }
            System.out.println("You are eligible.");
        } 
        catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Program Ended.");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}