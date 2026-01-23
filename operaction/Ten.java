package operaction;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ten {

	public static void main(String[] args) {
		
		Supplier<Animal>sup=Animal::new;
		System.out.println("Not Created Object");
		sup.get();
		System.out.println("Object Created here");
		Function<String,Animal>fun=Animal::new;
		fun.apply("Hello");
		fun.hashCode();
		
	}

}
class Animal
{
	public Animal()
	{
		System.out.println("Constrcutor Called");
	}
	public Animal (String s)
	{
		System.out.println("Constrcutor Called with the String"+s);
	}
}
