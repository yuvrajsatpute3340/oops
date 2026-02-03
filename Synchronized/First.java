package Synchronized;

public class First {
	
        public static void main(String[] args) throws Exception {
		
		Demo1 demo =new Demo1();
		One one = new One();
		Two two = new Two();
		
		one.demo=demo;
		two.demo=demo;
		
		one.start();
		two.start();
		
		Thread.sleep(1000);
		System.out.println(demo.getIncres());
		
}
}
class Demo1{
	int count=0;
	public void Incress()
	{
		this.count++;
		}
	
	public int getIncres()
	{
		return this.count;
	}
}
class One extends Thread
{
	Demo1 demo;
	public void run()
	{
		for(int i=0;i<500;i++)
		{
		demo.Incress();
		}
	}
}
class Two extends Thread
{
	Demo1 demo;
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
		demo.Incress();
		}
	}
}
