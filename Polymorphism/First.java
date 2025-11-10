package Polymorphism;

public class First {

	public static void main(String[] args) {
		Aeroplane aero=new Aeroplane();
		System.out.println(aero.fly(12,"ab"));
	}

}

class Aeroplane
{
	public Aeroplane() 
	{
		System.out.println(":Yuvraj:");
	}
	public Aeroplane(int i)
	{
		System.out.println("Integer const");
	}
	public int fly (int i, String st)
	{
		return 12;
	}
	public void fly(String st,int i)
	{
		System.out.println("B");
	}
	public void fly(int i,int j,int k)
	{
		System.out.println("C");
	}
	public int run(double d)
	{
		return 1;
	}
	public double run (double d,int i)
	{
		return 1.0;
	}
}
