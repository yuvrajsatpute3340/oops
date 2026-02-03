package Synchronized;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		
		Unique unii= new Unique();
		Three three =new Three();
		Four four =new Four();
		
		three.unii=unii;
		four.unii=unii;
		
		three.start();
		four.start();
		
		Thread.sleep(1000);
		System.out.println(unii.getIn());	
	}
	}
class Unique
{
	int count=0;
	public void Incr()
	{
		this.count++;
	}

public int getIn()
{
	return this.count;
}
}
class Three extends Thread
{
	Unique unii;
	public void run()
	{
		for (int i=0;i<700;i++)
		{
			unii.Incr();
		}
	}
}
class Four extends Thread
{
	Unique unii;
	public void run()
	{
		for (int i=0;i<700;i++)
		{
			unii.Incr();
		}
	}
}


