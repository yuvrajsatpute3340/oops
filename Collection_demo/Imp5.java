package Collection_demo;

import java.util.Objects;

public class Imp5 {

	public static void main(String[] args) {
		Home Aai=new Home("ABC",34.56);
		Home Baba=new Home("ABC",34.56);
		
		System.out.println(Aai.equals(Baba));
		
		System.out.println(Aai.hashcode());
		System.out.println(Baba.hashcode());
	}
}
class Home
{
	String name;
	double price;
	
	public Home(String name,double price)
	
	{
		this.name=name;
		this.price=price;
	}
	public int hashcode()
	{
		return Objects.hash(price,name);
	}
}
