package Basic;

public class First {

	public static void main(String[] args) throws Exception {
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		
		Thread.sleep(3000);
		//throw new Exception("MAin Treminated");
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		int count=1;
		while(count<50)
		{
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("King");
			count++;
		}
	}
}
