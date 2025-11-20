package info;

public class Second {

	public static void main(String[] args) {
		String str="sunday";
		String str2=str.toLowerCase();
		 try 
		 {
			if(str2.equals("sunday")==false)
			{
				throw new NotSundayExecption();
			}
			System.out.println("Lets play cricket>>>>");
		 }
		 catch(NotSundayExecption ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 finally 
		 {
			 System.out.println("The End");
		 }
	}

}
class NotSundayExecption extends Exception
{
	public NotSundayExecption()
	{
		super("Not a Sunday Exception...Today is not sunday,");
	}
}
