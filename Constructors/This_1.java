package Constructors;

public class This_1 {

	public static void main(String[] args) {
		Animal animal=new Animal(100,"elephant","pune",10.8f);
		Animal an2=new Animal(1,"a","p",8);
		animal.displaycity();
	}

}
class Animal

{
	int id;
	String name;
	String city;
	double ty;
	public Animal(int id,String name,String city,double ty)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.ty=ty;
	}
	public void displaycity()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.city);
		System.out.println(this.ty);

	}
}
