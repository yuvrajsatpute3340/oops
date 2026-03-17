package custom_comple_time;

public class Fifth {

    public static void main(String[] args) {
        int number = -10;  // example negative number

        try {
            checkPositive(number);
            System.out.println("Number is positive: " + number);
        } catch (NegativeNumberException ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }

        System.out.println("Program continues...");
        System.out.println("The END");
    }

    static void checkPositive(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Number cannot be negative: " + n);
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
