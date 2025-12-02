package removemethod;

import java.util.ArrayList;
import java.util.List;

public class First {

	public static void main(String[] args) {
		
		List<String>obj=new ArrayList<String>();
		
		obj.add("unique");//0
		obj.add("System");//1
		obj.add("pvt ltd");//2
		obj.add("India");//3
		obj.add("Baleno");//4
		obj.add("WagonR");//5
		obj.add("Nexon");//6
		obj.add("Punch");//7
		obj.add("Harrier");//8
		obj.add("i20");//9
		obj.add("Creta");//10
		obj.add("Venue");
		obj.add("Seltos");//11;
		obj.add("Sonet");//12
		obj.add("Bolero");//13
		obj.add("Scorpio");//14
		obj.add("XUV700");//15
		obj.add("Fortuner");//16
		obj.add("Innova");//17
		obj.add("Honda City");//18
		//obj.remove(2);
		
		System.out.println("Total Car 18:"+obj);
		System.out.println("Remove The Car :"+obj.remove(5));

	}
}



