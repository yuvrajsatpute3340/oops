package generics;

public class Third {

	public static void main(String[] args) {
		adder<String>iad =new adder<String>();
		Objects<String>iadd=new Objects<String>();
		
		iad.add("40","50");
		iadd.add("60","70");
		
		System.out.println(iad.getinstance("Well"));
		System.out.println(iadd.getinstance("Come"));

	}
}
interface xadd<R>
{
	void add(R t1, R t2);
}
interface yadd<y>
{
	void add(y i1, y i2);
}
class adder<R> implements xadd<R>
{
	public void add(R t1, R t2)
	{
		if (t1 instanceof Integer && t2 instanceof Integer)
		{
			int a=(int)t1;
			int b=(int)t2;
			System.out.println(a+b);
		}
		else if(t1 instanceof Integer && t2 instanceof Integer)
		{
			String s1=(String)t1;
			String s2=(String)t2;
			System.out.println("String Found:"+s1+s2);
		}
	}
	public int getinstance(R t)
	{
		if (t instanceof String)
		{
			return ((String)t).length();
		}
		return 0;
	}
}
class Objects<y> implements yadd<y>
{
	public void add(y i1,y i2)
	{
		if (i1 instanceof Integer && i2 instanceof Integer)
		{
			int j=(int)i1;
			int k=(int)i2;
			System.out.println(j+k);
		}
		else if(i1 instanceof Integer && i2 instanceof Integer)
		{
			String p1=(String)i1;
			String p2=(String)i2;
			System.out.println("String Found:"+p1+p2);
		}
	}
	public int getinstance(y i)
	{
		if (i instanceof String)
		{
			return ((String)i).length();
		}
		return 0;
	}
}