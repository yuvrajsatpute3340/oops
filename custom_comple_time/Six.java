package custom_comple_time;

public class Six {

    public static void main(String[] args) {
        int age = 15; // example age

        try {
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (UnderageException ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }

        System.out.println("You can proceed...");
        System.out.println("The END");
    }

  
    static void validateAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("Age must be 18 or older. Provided: " + age);
        }
    }
}


class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}