package Synchronized;

public class Fourth {

	public static void main(String[] args) throws InterruptedException {
		
		AB ab=new AB();
		yu YU=new yu();
		uy UY=new uy();
		
		YU.ab=ab;
		UY.ab=ab;
		
		YU.start();
		UY.start();
		
		Thread.sleep(2000);
	   // System.out.println(ab.ram());
		System.out.println(ab.sham());
	}

}
class AB
{
	int count;
	public void ram()
	{
		this.count++;
	}
	public int sham()
	{
		return this.count;
	}
}
class yu extends Thread
{
	AB ab;
	public void run()
	{
		for (int k=0;k<100;k++)
		{
			ab.ram();
		}
	}
}
class uy extends Thread
{
	AB ab;
	public void run()
	{
		for (int k=0;k<100;k++)
		{
			ab.ram();
		}
}
}
