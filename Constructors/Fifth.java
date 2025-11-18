package Constructors;

//import com.yuvi.constructur_demo.sample;

public class Fifth {
	private int x,y;
	private Fifth(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "sample [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[]args)
	{
		Fifth s=new Fifth(12,24);
		System.out.println(s);
	}
	

}
