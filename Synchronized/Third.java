package Synchronized;

public class Third {

	public static void main(String[] args) throws InterruptedException {
		
		
		ABC abc=new ABC();
		yuvi Yuvi=new yuvi();
		raj Raj =new raj();
		
		Yuvi.abc=abc;
		Raj.abc=abc;
		
		Yuvi.start();
		Raj.start();
		
		Thread.sleep(1000);
		System.out.println(abc.xyz());
	}

}
class ABC
{
	int count;
	public void abc()
	{
		synchronized(this) {
		this.count++;
	}
	}
	public int xyz() {
		return this.count;
	}
}
class yuvi extends Thread
{
	ABC abc;
	public void run()
	{
		for (int j=0;j<5;j++)
		{
			abc.abc();
		}
	}
}
class raj extends Thread
{
	ABC abc;
	public void run()
	{
		for (int j=0;j<5;j++)
		{
			abc.abc();
		}
	}
}
