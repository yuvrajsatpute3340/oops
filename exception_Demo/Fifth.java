package exception_Demo;

public class Fifth {

	public static void main(String[] args) {
		try
		{
			throw new Exception("compile time..");
		}
		catch(Exception ex )
		{
			System.out.println(ex.getMessage());
		}
	}

}
