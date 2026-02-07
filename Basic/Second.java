package Basic;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		
		NumberPriner np =new NumberPriner();
		NumberPriner np2 =new NumberPriner();
		NumberPriner np3 =new NumberPriner();
		NumberPriner np4 =new NumberPriner();
		
		np.start();
		np.join();
		np2.start();
		np2.join();
		np3.start();
		np4.start();
		np.run();
		int count=1;
		while (count <100)
		{
			System.out.println("hello");
			Thread.sleep(1500);
			count++;
			
		}
		
		
	}
}
class NumberPriner extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":::calling run");
		System.out.println("Start internally callling the run method....");
		for (int i=1;i<10;i++)
		{
			try {
				Thread.sleep(1500);
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			System.out.println(i);
		}
	}
	public void run(int i)throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+"calling cusom run");
		for (int j=0;j<15;j++)
		{
			Thread.sleep(1500);
			System.out.println("***********");
		}
	}
}