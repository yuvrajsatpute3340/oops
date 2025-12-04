package foreachloop;

import java.util.HashSet;

public class Third {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
