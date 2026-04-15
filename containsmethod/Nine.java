package containsmethod;

public class Nine {
    public static void main(String[] args) {

        String str = "aBcEg";

        str = str.toLowerCase(); // 🔥 important

        char start = str.charAt(0);
        char end = str.charAt(str.length() - 1);

        for (char ch = start; ch <= end; ch++) {
            if (str.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }
    }
}