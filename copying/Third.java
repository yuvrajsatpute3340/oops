package copying;

public class Third {

	public static void main(String[] args) throws Exception {
		
		Bike bike=new Bike("i20",151);
		bike.cc=120;
		
		System.out.println(bike.cc);
		System.out.println(bike.name);

	}

}
class Bike
{
	String name;
	int cc;
	
	public Bike(String name,int cc) throws Exception
	{
		if(cc>200)
		{
			throw new Exception("not a real bike...");
		}
		this.cc=cc;
		this.name=name;
		System.out.println("objected created...");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
}
}
