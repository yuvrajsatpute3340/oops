package Practic_logical_prg;

import java.util.HashMap;
import java.util.Map;

public class Imp_prg {

	public static void main(String[] args) {
		
		String str="UniqueSystemPvt.LtdIndia";
		char[]chars =str.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char c:chars)
		{
			int frequency=1;
			if(map.containsKey(c))
			{
				frequency=map.get(c)+1;
			}
			map.put(c,frequency);
		}
		System.out.println(map);
	}
}
