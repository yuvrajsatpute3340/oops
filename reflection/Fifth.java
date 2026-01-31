package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Fifth {

	public static void main(String[] args)   throws Exception{
		
		System.out.println(Bag.class);
		Class<?>cl=Class.forName("reflection.Bag");
		
	 Constructor<?>[]cs=cl.getDeclaredConstructors();
	 Constructor<?>cs2=cl.getDeclaredConstructor(String.class);
	 
	 cs2.setAccessible(true);
	 
	 Bag bg=(Bag)cs2.newInstance("Saheb");
	 Field[] field =cl.getDeclaredFields();
	 Field f=cl.getDeclaredField("name");
	 
	 f.setAccessible(true);
	 f.set(bg, "Desaii"); 
	 
	System.out.println(f.get(bg));
	System.out.println();
	 
	}
}
class Bag
{
	public String name;
	public int id;
	
	public Bag(String name)
	{
		this.name=name;
	}
}