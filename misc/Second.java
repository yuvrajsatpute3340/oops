package misc;

public class Second {

	public static void main(String[] args) {
		A.demo();
		B.demo();
	}
} 
interface A
{
	default void run() {
		System.out.println("Hello");
	}
	static int demo() {
		return 1;
    }
   }
interface B
{
	default void run() {
		System.out.println("Wellcome");
	}
	static void demo()
	{
		System.out.println("form a second interface..");
	}
}
class c implements A,B
{

	@Override
	public void run() {
		A.super.run();
		B.super.run();
		System.out.println("c");
	}
	public void demo() {
	System.out.println("Unique");
}
}

