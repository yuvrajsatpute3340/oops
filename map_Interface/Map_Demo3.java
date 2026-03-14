package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo3 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(new Integer(100), "First");
        map.put(Integer.valueOf(100), "Second");

        System.out.println(map.size());
        System.out.println(map);
    }
}