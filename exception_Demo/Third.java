package exception_Demo;

public class Third {

	public static void main(String[] args) {
		try 
		{
			System.out.println(10/0);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("ABC");
	}

}
