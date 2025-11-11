package Abstraction;

public class Second {

	public static void main(String[] args) {
		School School1=new Teacher();
		School School2=new Student();
		
		School1.Blackbord("White chock");
		School2.Blackbord("Pink chock");
	}
}
abstract class School
{
	public void run()
	{
		System.out.println("Writting fast..");
	}
	abstract void Blackbord(String str);
	public School()
	{
		System.out.println("...........");
	}
}
class Teacher extends School
{
	void Blackbord (String str)
	{
		System.out.println("Teacher is a best :"+str);
	}
}
class Student extends School
{
	void Blackbord (String str)
	{
		System.out.println("Student is good :"+str);
	}
}

