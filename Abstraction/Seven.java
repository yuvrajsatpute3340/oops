package Abstraction;

public class Seven {

	public static void main(String[] args) {
		
		System.out.println("xgc");
		
	}
}
abstract class Aeroplane
{
	public abstract String start(String password);
	
	public void stop()
	{
		System.out.println("I Am Stopping The Aeroplane...");
		}
	public Aeroplane()
	{
		System.out.println("Hello");
	}
}
abstract class Boing extends Aeroplane
{
	
}