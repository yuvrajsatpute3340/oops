package Practic_Array;

import java.util.HashMap;
import java.util.Map;

public class Imp {

	public static void main(String[] args) {
		
		String str="yuvrajSatpute";
		char[]chars =str.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char c:chars)
		{
			int frequency=1;
			if (map.containsKey(c))
			{
				frequency=map.get(c)+1;
			}
			map.put(c,frequency);
			}	
		System.out.println(map);
	}

}
