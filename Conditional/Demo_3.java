package Conditional;

public class Demo_3 {

	public static void main(String[] args) {
		
		int maths = 70;
		int science = 65;
		int english = 80;

		if (maths >= 35 && science >= 35 && english >= 35)
		{
			System.out.println("Student Passed");
		}
		else
		{
			System.out.println("Student Failed");
		}
	}
}