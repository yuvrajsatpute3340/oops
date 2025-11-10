package Inheritance;

public class StringLogic {

	public static void main(String[] args) {
		demo demo=new demo();
		System.out.println(demo.name);
		demo.add(12,12);
	}

}
class StringHelper
{
	public final String name="macdonalds";
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
}
class demo extends StringHelper
{
	
}
