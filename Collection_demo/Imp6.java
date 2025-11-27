package Collection_demo;

import java.util.Objects;

public class Imp6 {

	public static void main(String[] args) {
		Animal Dog=new Animal("Roy",64,1);
		Animal Cat=new Animal("mau",64,2);
		Animal Cow=new Animal("mata",64,3);

		
		System.out.println(Dog.equals(Cat));
		
		System.out.println(Dog.hashcode());
		System.out.println(Dog.hashcode());
		System.out.println(Dog.hashcode());


	}
}
class Animal
{
	String name;
	double price;
	float id;
	
	public Animal(String name,double price,float id)
	{
		this.name=name;
		this.id=id;
		this.price=price;	
	}
	public int hashcode() 
	{
		return Objects.hash(price,name,id);
	}
}
