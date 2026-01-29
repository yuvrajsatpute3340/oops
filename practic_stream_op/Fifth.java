package practic_stream_op;

import java.lang.reflect.Constructor;

public class Fifth {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		
		System.out.println(Collage1.class);
		Class<?> c1=Class.forName("practic_stream_op.Collage1");
		Constructor<?>cs=c1.getDeclaredConstructor();
		System.out.println(c1);
		
	}

}
class Collage1
{
	String s1;
	public Collage1()
	{
		
	}
	Collage1(int a)
	{
		
	}
	private Collage1 (String s1)
	{
		this.s1=s1;
	}
}