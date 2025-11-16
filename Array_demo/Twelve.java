package Array_demo;

import java.util.ArrayList;
import java.util.List;

record Dog(String name)
{
	
}
public class Twelve {

	public static void main(String[] args) {
		Dog dog = getDogobject().get(0);
		System.out.println(dog.name());
	}
	public static List<Dog> getDogobject()
	{
		List<Dog> listofDogs = new ArrayList<Dog>();
		
		listofDogs.add(new Dog("A"));
	    listofDogs.add(new Dog("B"));
		listofDogs.add(new Dog("C"));
		
		return listofDogs;


	}

}
