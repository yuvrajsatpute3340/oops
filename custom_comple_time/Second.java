package custom_comple_time;

public class Second {

	public static void main(String[] args) {
		int i=13;
		try
		{
			if(i>10 && i<20)
			{
				throw new Ten_Exception();
			}
			else if(i>20 && i<30)
			{
				throw new Twenty_Exception();
			}
			else if(i>30 && i<40)
			{
				throw new Thirty_Exception();
			}
			else 
			{
				System.out.println("HIII,"+i);
			}
		}
		catch(Twenty_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Ten_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Thirty_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println(".....The End....");
		}
	}

}
class Ten_Exception extends Exception
{
	public Ten_Exception()
	{
		super("10 exception..!");
	}
}
class Twenty_Exception extends Exception
{
	public Twenty_Exception()
	{
		super("20 exception..!");
	}
}
class Thirty_Exception extends Exception
{
	public Thirty_Exception()
	{
		super("30 exception..!");
	}
}
