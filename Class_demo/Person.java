package Class_demo;

public class Person {
	String name;
	int age;
	double id;
	 //double personId;
	public Person(String personName,int personAge,double personId)
	{
		name=personName;
		age=personAge;
		id=personId;
	}
	public void displayInfo()
	{
		String maessage="Name:"+name+",Age:"+age+",id:"+id;
		System.out.println(maessage);
		}

	public static void main(String[] args) {
		Person person1=new Person("Ram",25,1234567.678);
		person1.displayInfo();
	}

}
