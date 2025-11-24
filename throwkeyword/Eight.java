package throwkeyword;

class Eight {
    static void checkNumber(int num) throws Exception {
        if (num < 0) {
        	throw new Exception("Number must be positive. You entered: " + num);
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);   
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program ended successfully.");
    }
}
