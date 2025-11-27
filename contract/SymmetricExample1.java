package contract;

public class SymmetricExample1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str2.equals(str1): " + str2.equals(str1)); // true
    }
}
