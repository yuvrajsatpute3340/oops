package Static_Variable;

public class Static_demo1 {

	public static void main(String[] args) {
		Animal tiger = new Animal();
		Animal elephant=new Animal();
		
		tiger.city="pune";
		elephant.city="mumbai";
		
		//tiger.name="Sherkhan";
		elephant.name="Jumbo";
		tiger.name="Sherkhan";

		System.out.println("T:city:"+tiger.city);
		System.out.println("tiger name:"+tiger.name);
		
		System.out.println("e:city:"+elephant.city);
		System.out.println("elephant name:"+elephant.name);
	}

}
class Animal
{
	static String name;
	String city;
}
