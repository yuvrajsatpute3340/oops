package Practic_logical_prg;

public class Reverse_str {

	public static void main(String[] args) {
//		String str = "YUVRAJ";
//        String rev = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//
//        System.out.println("Reversed String: " + rev);
		
		 String str = "well come";
	        String reverse = new StringBuffer(str).reverse().toString().toUpperCase();
	        System.out.println(reverse);
		
		
}
}