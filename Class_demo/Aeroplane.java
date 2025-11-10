package Class_demo;

public class Aeroplane {

	 String name;
	 double price;

	public static void main(String[] args) {
		Aeroplane boleing=new Aeroplane();
		boleing.fly();
		
		System.out.println(boleing.price);
		Aeroplane Air_Ind=new Aeroplane();
		
		      Air_Ind.name="77av";
		      Air_Ind.price=434534.56;
		      Air_Ind.fly();
	}

	private void fly() {
		// TODO Auto-generated method stub
		
	}

}
class Aeroplane1
{
	public void fly()
	{
		String s="Dandan";
		System.out.println("No.of pilots are:"+5);
		System.out.println("aeroplane has started.....");
		}
	public void land()
	{
		System.out.println(name);
		System.out.println("landing....");
	}
	String name;
	double price;
}
