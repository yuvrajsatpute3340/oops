package lambdas;

public class Second {

	public static void main(String[] args) {
		
		B_add<Integer,String>badd=(y1,y2,y3)->
		{
			return y1+y2+y3;
		};
		Integer sum=badd.add(50,50,50);
		System.out.println(sum);
	}
}
interface B_add<T,R>
{
	T add(T t1,T t2,T t3);
}
