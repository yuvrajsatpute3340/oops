package Practic_logical_prg;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a = 1, b = 2, n = 30;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
	}

}
}
