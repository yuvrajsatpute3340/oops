package Class_demo;

class Dog1
{
	String name;
	String color;
	int age;
	Dog1(String name,String color,int age)
	{
		System.out.println("Dog name:"+name);
		System.out.println("color:"+color);
		System.out.println("age;"+age);
		this.name=name;
		this.color=color;
		this.age=age;
	}
}

public class Dog_1 {

	public static void main(String[] args) {
		
	}
	//System.out.println("Dog name:"+name);
	//System.out.println("color:"+color);
	//System.out.println("age;"+age);
	Dog1 dog1=new Dog1("mothi","white",4);


}

