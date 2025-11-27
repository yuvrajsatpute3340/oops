package Collection_demo;

public class Imp4 {

	public static void main(String[] args) {
		Bike one=new Bike(1,"TVS");
		Bike two=new Bike(2,"TVS");
		
		System.out.println(one.equals(two));
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
	}
}
class Bike
{
	int id;
	String name;
	
	public Bike(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int hashCode()
	{
		return 500;
	}
	public boolean equals(Object obj)
	{
		Bike bike=(Bike)obj;
		return this.id==bike.id && this.name.equals(bike.name);
	}
}
