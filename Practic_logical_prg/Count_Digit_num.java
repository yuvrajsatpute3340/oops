package Practic_logical_prg;

public class Count_Digit_num {

	public static void main(String[] args) {
		
		int num = 1234567891, count = 0;
		while (num != 0) {
		    count++;
		    num /= 10;
		}
		System.out.println(count);

	}
}
