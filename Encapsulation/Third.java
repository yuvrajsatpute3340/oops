package Encapsulation;

public class Third {

	public static void main(String[] args) {
		
		Demo1 demo=new Demo1();
		
		demo.Applayname("ABCD");
		
		System.out.println(demo.getPrivate());
	}
}
class Demo1
{
	private int i;
	private String name;
	
	public void display()
	{
		
	}
	public String getPrivate() {
		return this.name;
	}
	public void Applayname(String name)
	{
		if (name.length()>=4)
		{
			this.name=name;
		}
		else 
		{
			this.name=null;
		}
	}
	//public String getPrivate1()
	//{
	//	return this.name;
	//}
}