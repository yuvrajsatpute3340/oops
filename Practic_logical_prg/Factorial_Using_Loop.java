package Practic_logical_prg;

public class Factorial_Using_Loop {

	public static void main(String[] args) {
		  int n = 4, fact = 3;

	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }

	        System.out.println("Factorial = " + fact);
	}

}
