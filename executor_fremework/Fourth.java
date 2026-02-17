package executor_fremework;

public class Fourth {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			int count =1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (count<10)
			{
				System.out.println("First Thread*************************");
			}
			
		});
		Thread t2=new Thread(()->{
			int count =1;
			while(true)
			{
				System.out.println("Second Thread");
			}
		});
		Thread t3=new Thread(()->{
			int count =1;
			while(true)
			{
				System.out.println("Third thread");
			}
			
		});
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(10);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
