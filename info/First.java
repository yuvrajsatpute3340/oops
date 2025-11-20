package info;

public class First {

	public static void main(String[] args) {
		int age=23;
		try
		{
			if (age<20)
			{
				throw new InvalidAgeException("You Are Not Eligible");
			}
			System.out.println("You Are Eligible..");
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("...The End...");
		}
	}

}
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}

	
	}
