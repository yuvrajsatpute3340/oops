package listif;

import java.util.ArrayList;
import java.util.List;

public class Eight {

	public static void main(String[] args) {
		
		List<String>car=new ArrayList<String>();
		
		car.add("i20");
		car.add("Creta");
		car.add("Venue");
		car.add("Verna");
		car.add("Tucson");
		
		System.out.println("Car List :");
		for(String Car : car)
		{
			System.out.println(car);
		}
		car.remove("i20");
		
		System.out.println("Update Car List :"+car);
		
	}

}
