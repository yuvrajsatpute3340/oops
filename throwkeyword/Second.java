package throwkeyword;

public class Second {

	public static void main(String[] args) throws Exception
	{
		Demo demo=new Demo();
	}

}
class Demo
{
	public Demo()throws Exception
	{
		throw new Exception("Hello");
	}
}
class Demo_1 extends Demo
{
	public Demo_1() throws Exception
	{
		super();
	}
}
