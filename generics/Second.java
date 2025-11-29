package generics;

public class Second {

	public static void main(String[] args) {
		Object<String>idd=new Object<String>();
		idd.add("30","40");
		System.out.println(idd.getinstance("come"));
	}
}
interface Aadd<y>
{
	void add(y t1, y t2);
}
class Object<y>implements Aadd<y>
{
	public void add(y t1, y t2)
	{
		if(t1 instanceof Integer && t2 instanceof Integer)
		{
			int x=(int)t1;
			int y=(int)t2;
			System.out.println(x+y);
		}
		else if(t1 instanceof String && t2 instanceof String)
		{
			String s1=(String)t1;
			String s2=(String)t2;
			System.out.println("String found:"+s1+s2);
		}
	}
	public int getinstance(y t)
	{
		if (t instanceof String)
		{
			return ((String)t).length();
			}
		return 0;
	}
}