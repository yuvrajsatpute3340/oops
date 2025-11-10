package Constructors;

public class Second {

	public static void main(String[] args) {
		Laptop lp=new Laptop(12390);
		//lp.price=1234;

	}

}
class Laptop
{
	double price;
	public Laptop(double value)
	{
		displayprice();
		price=value;
	}
	public void displayprice() {
		if (price>500)
		{
			System.out.println("The price is:"+price);	
		}
		else
		{
			System.out.println("Not enough for laptop");
		}
	}
}
