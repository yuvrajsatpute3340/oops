package lambdas;

public class Third {
	
public static void main(String[] args) {
		
		C_add<Integer,String>cadd=(y1,y2,y3)->
		{
			return y1+y2+y3;
		};
		Integer sum=cadd.add(50,50,50);
		System.out.println(sum);
	}
}
interface C_add<T,R>
{
	T add(T t1,T t2,T t3);

}
