package exception_Demo;

public class Second {

	public static void main(String[] args) {
		try
		{
			int a=20;
			int b=0;
			int result=a/b;
			System.out.println("Result"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:Division by zero is not allowed..!");
		}
		finally
		{
			System.out.println("This is the finally block it always run..!");
		}
		System.out.println("program continues after try-catch finally...");
	}

}
