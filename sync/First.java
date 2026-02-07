package sync;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		Demo de=new Demo();
		Demo de2=new Demo();
		
		one first=new one(de);
		one second =new one(de2);
		first.start();
		second.start();
		Thread.sleep(2500);
		
		System.out.println(de.getCount());
		System.out.println(de2.getCount());
		

	}

}
class Demo
{
	static int counter=0;
	public void incress()
	{
		synchronized(Demo.class) {
		counter++;
	}
}
public int getCount()
{
	return this.counter;
}
}
class one extends Thread
{
	Demo demo;
	
	public one (Demo demo)
	{
		this.demo=demo;
	}
	public void run()
	{
		for (int i=0;i<1000;i++)
		{
			demo.incress();
		}
	}
}
