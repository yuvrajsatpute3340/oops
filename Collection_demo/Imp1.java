package Collection_demo;

public class Imp1 {

	public static void main(String[] args) {
		
		Car one=new Car(2,"Marutii");
		Car two=new Car(3,"Marutii");
		
		System.out.println(one.hashcode());
		System.out.println(two.hashcode());
	}

}
class Car
{
	int id;
	String name;
	
	public Car(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int hashcode()
	{
		return 100;
	}
	public boolean equals(Object obj)
	{
		Car car=(Car)obj;
		
		return this.id==car.id && this.name.equals(car.name);
	}
}
