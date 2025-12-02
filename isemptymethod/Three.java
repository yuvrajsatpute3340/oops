package isemptymethod;

import java.util.HashMap;

public class Three {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        System.out.println("Is map empty? " + map.isEmpty());

        map.put("Name", "Alice");
        System.out.println("After adding an entry, is map empty? " + map.isEmpty());
    }
}
