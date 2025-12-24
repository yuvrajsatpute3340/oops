package map_Interface;

import java.util.HashMap;

public class First {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
		map.put(23,"XYZ");
		map.put(1, "ABC");
		map.put(2, "abc");
		map.put(3, "cba");		
		map.put(4, "yuv");
		
		System.out.println(map.get(23));
		System.out.println(map.getOrDefault(23,"default"));
		System.out.println(map);

	}

}
