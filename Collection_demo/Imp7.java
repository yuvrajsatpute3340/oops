package Collection_demo;

public class Imp7 {

	public static void main(String[] args) {
		Adidas one=new Adidas(1,"Shirt",70.78);
		Adidas two=new Adidas(2,"Pant",70.78);
		Adidas three=new Adidas(3,"watch",70.78);
		
		System.out.println(one.equals(three));
		
		System.out.println(one.hashcode());
		System.out.println(two.hashcode());
		System.out.println(three.hashcode());
	}
}
class Adidas
{
	int id;
	String name;
	double price;
	
	public Adidas(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int hashcode()
	{
		return 300;
	}
	public boolean equals(Object obj)
	{
		Adidas adidas=(Adidas)obj;
		return this.id==adidas.id && this.name==adidas.name&& this.equals(adidas.price);
	}
}
