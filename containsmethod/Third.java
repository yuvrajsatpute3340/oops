package containsmethod;

import java.util.ArrayList;

public class Third {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        if (colors.contains("Blue")) {
            System.out.println("Blue is in the list.");
        } else {
            System.out.println("Blue is NOT in the list.");
        }
    }
}
