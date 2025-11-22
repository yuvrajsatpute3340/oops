package exception_Demo;

	import java.util.InputMismatchException;
	import java.util.Scanner;
	class NegativeNumberException extends Exception {
	    public NegativeNumberException(String message) {
	        super(message);
	    }
	}

	public class Six {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter numerator: ");
	            int num = sc.nextInt();

	            System.out.print("Enter denominator: ");
	            int den = sc.nextInt();
	            if (num < 0) {
	                throw new NegativeNumberException("Numerator cannot be negative!");
	            }
	            int result = num / den;
	            System.out.println("Result = " + result);
	        } 
	       	        catch (InputMismatchException e) {
	            System.out.println("Error: Please enter only integer values.");
	        }
	        	        catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	        	        catch (NegativeNumberException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        	        finally {
	            System.out.println("Execution Completed.");
	            sc.close();
	        }
	    }
	}


