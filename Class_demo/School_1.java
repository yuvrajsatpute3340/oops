package Class_demo;

public class School_1 {

	public static void main(String[] args) {
		int age=23;
		   School Little_star=new School();
		   Little_star.name="Little_angle";
		   Little_star.pincode="121212";
		         Little_star.add();
		         School poddar=new School();
		         poddar.name="PDS";
		         poddar.pincode="343434";
		         poddar.add();
		         poddar.add();
		         poddar.add();
	}

}
class School
{
	String name;
	String pincode;
	public void add()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
		System.out.println("This is the add method of school class");
	}
}
