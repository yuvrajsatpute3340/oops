package Array_demo;

import java.util.ArrayList;

public class Eleven {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList();
		a1.add("Ravi");
		a1.add("Ajay");
		a1.add("Vijay");
		
		for(int i=0;i<a1.size();i++)
		{
			String name = a1.get(i);
			System.out.println(name.toUpperCase());
		}

		
		
		
	}
}