package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_demo1 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put(new String("Java"), 10);
        map.put(new String("Java"), 20);

        System.out.println(map.size());
        System.out.println(map);
    }
}