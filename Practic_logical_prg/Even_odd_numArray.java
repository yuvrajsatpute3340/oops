package Practic_logical_prg;

public class Even_odd_numArray {
	    public static void main(String[] args) {

	        int[] arr = {1, 4, 7, 8, 12, 15};
	        int even = 0, odd = 0;

	        for (int num : arr) {
	            if (num % 2 == 0)
	                even++;
	            else
	                odd++;
	        }

	        System.out.println("Even count: " + even);
	        System.out.println("Odd count: " + odd);
	    }
	}


