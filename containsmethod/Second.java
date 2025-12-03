package containsmethod;

public class Second {
    public static void main(String[] args) {
        String text = "Java programming is fun!";

        if (text.contains("Java")) {
            System.out.println("The word 'Java' is present in the text.");
        } else {
            System.out.println("The word 'Java' is NOT present.");
        }
    }
}
