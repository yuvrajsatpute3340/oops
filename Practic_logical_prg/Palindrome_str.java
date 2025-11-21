package Practic_logical_prg;

public class Palindrome_str {

	public static void main(String[] args) {
		String s = "Yuvraj";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

	}

}
