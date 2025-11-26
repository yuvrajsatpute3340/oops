package contract;

public class Seven {

	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.equals(12));
	}
}
class Demo
{
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		return true;
	}
}
