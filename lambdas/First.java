package lambdas;

public class First {

	public static void main(String[] args) {
		
		I_add<Integer,String> iadd=(i1,i2,i3)->{
			
			return new StringBuffer("Hello").append(i1+i2+i3).toString();
		};
		
		String sum=iadd.add(100,200,100);
		System.out.println(sum);
	}
}
interface I_add<T,R>
{
	R add(T t1,T t2,T t3);
}