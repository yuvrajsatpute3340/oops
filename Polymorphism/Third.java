package Polymorphism;

public class Third {

	public static void main(String[] args) {
		B12 b1=new B12();
		b1.seat();
		b1.show();
	}
}
class planet
{
	public String name="Aqua";
	public void show()
	{
		System.out.println("Show method planet...");
		}
	public void seat()
	{
		System.out.println("Seat method of the planet..");
	}
	public planet()
	{
		System.out.println("The Constructor of the planet..");
	}
	public planet(int i)
	{
		System.out.println("The parem wala of the planet..");
	}
}
class Blue extends planet
{
	public String name="demo";
	public Blue()
	{
		super();
		System.out.println("The constructor of the blue class.. ");
	}
	public void seat() 
	{
		System.out.println("This is the seat of the blue");
	}
}
class B12 extends Blue
{
	public int seat(int i)
	{
		return 0;
	}
	public B12()
	{
		super();
		System.out.println("The constructor of the b12");
	}
}
