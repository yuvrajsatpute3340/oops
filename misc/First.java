package misc;

public class First {
	public static void main (String args[]) {
		demo d=new demo();
		d.run();
	}

}
interface I_one
{
	default void run()
	{
		System.out.println("form I_one :");
		}
}
interface I_two
{
	default void run()
	{
		System.out.println("form I_two :");
	}
}
interface two extends I_one
{
	default void run(int i,int j)
	{
		System.out.println("I_two");
	}
	default void run()
	{
		System.out.println("Zero");
	}
}
class demo implements I_two
{
	
}
