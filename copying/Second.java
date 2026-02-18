package copying;

public class Second {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student1 one =new Student1();
		one.id=30;
		one.name="yuvraj";
		
		Student1 two=(Student1)one.clone();
		
		two.id=40;
		System.out.println(one.id);
		System.out.println(two.id);
		System.out.println(one==two);
		
	}

}
class Student1 implements Cloneable
{
	int id;
	String name;
	
	public Student1()
	{
		System.out.println("called..");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
