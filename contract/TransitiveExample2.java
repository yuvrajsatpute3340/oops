package contract;

public class TransitiveExample2 {
    public static void main(String[] args) {
        Integer n1 = 100;
        Integer n2 = 100;
        Integer n3 = 100;

        System.out.println("n1.equals(n2): " + n1.equals(n2)); // true
        System.out.println("n2.equals(n3): " + n2.equals(n3)); // true
        System.out.println("n1.equals(n3): " + n1.equals(n3)); // true (Transitive)
    }
}
