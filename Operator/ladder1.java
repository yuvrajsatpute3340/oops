package Operator;

public class ladder1 {

	public static void main(String[] args) {
		double mark=50;
		if (mark >=35 && mark <=45)
		{
			System.out.println("Third division");
		}
		else if (mark >45 && mark <=60)
		{
			System.out.println("Second division");
		}
		else if (mark >60 && mark <=75)
		{
			System.out.println("first division");
		}
		else if (mark >75 && mark <=100)
		{
			System.out.println("Disitions");
		}
		else
		{
			System.out.println("You have failled or invalid mark...........");
		}
	}

}
