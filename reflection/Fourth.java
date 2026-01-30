package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Fourth {

	public static void main(String[] args)  throws Exception{ 
		
		System.out.println(Unique.class);
		
		Class<?>cl=Class.forName("reflection.Unique");
		
		Constructor <?>[] cs =cl.getDeclaredConstructors();
		
		Constructor <?> cs2 =cl.getDeclaredConstructor(String.class);
		cs2.setAccessible(true);
		Unique uni =(Unique)cs2.newInstance("nanda");
		
		Field[] field =cl.getDeclaredFields();
		
		for(Field f :field) {
			System.out.println(f);
		}
		
		Field f=cl.getDeclaredField("name");
		f.setAccessible(true);
		//f.set(uni, "yuvraj");
		System.out.println(f.get(uni));
		System.out.println();
		
	}
}
class Unique{
	private String name;
	private double id;
	public String dept;
	
	private Unique (String name)
	{
		this.name=name;
	}
}
