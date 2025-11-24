package throwkeyword;

class Seven {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
        	throw new ArithmeticException("Access Denied: You must be 18 or older.");
        } else {
            System.out.println("Access Granted: You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);        
     } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
