package Practic_logical_prg;

public class Prime_num {

	public static void main(String[] args) {
		int n = 33;
        boolean isPrime = true;

        if (n < 2) isPrime = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + (isPrime ? " is Prime" : " is Not Prime"));
    }

	}

