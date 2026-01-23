package operaction;

import java.util.List;

public class Six {

	public static void main(String[] args) {
		
		Demo_Method_ref d=new Demo_Method_ref();
		int sum =List.of(11,22,33,44,55)
				.stream()
				.filter(d::Yuvraj)
				.reduce(0,d::Satpute);
		
		System.out.println(sum);
		
	}

}
class Demo_Method_ref
{
	public boolean Yuvraj(int i)
	{
		return i>30;
	}
	public void Yuvi(int i)
	{
		System.out.println(i);
	}
	public int Satpute(int i,int j)
	{
		return i+j;
	}
}
