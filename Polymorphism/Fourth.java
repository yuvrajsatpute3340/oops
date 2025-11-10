package Polymorphism;

public class Fourth {

	public static void main(String[] args) {
		Human human=new man();
		A a=human.show();
		A a1=new c();
	}
}
class Human
{
	String name="Human";
	public A show()
	{
		System.out.println("This is method !!");
		return new A();
	}
	public Human()
	{
		System.out.println("A");
	}
}
class man extends Human
{
	public man()
	{
		super();
		System.out.println("B");
	}
	public C show()
	{
		System.out.println("hellow");
		return new C();
	}
	public int show(int i)
	{
		return i;
	}
	public void run()
	{
		System.out.println("man is running...");
	}
}
class A
{
	
}
class A extends B
{
	
}
class c extends z
{
	String name="jumbo";
	public c()
	{
		System.out.println("This c is call");
	}
}
class z
{
	
}
