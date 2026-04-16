package custom_comple_time;

public class Seven {

    public static void main(String[] args) {
        int age = 15;
        try {
            if(age < 18) {
                throw new InvalidAgeException("Age is less than 18");
            }
        }
        catch(InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Welcome to the system...");
        System.out.println("The END");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}