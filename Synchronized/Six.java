package Synchronized;

public class Six {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"stared");
			while(true)
			{
				while(true)
				{
					while(true)
					{
						for(long i=0;i<50;i++)
						{
							System.out.println(i);
						}
					}
				}
			}
		});
		Thread t2=new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"stared");
			while(true)
			{
				while(true)
				{
					while(true)
					{
						for(long i=0;i<50;i++)
						{
							System.out.println(i);
						}
					}
				}
			}
		});
		Thread t3=new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"stared");
			while(true)
			{
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("third");
			
		}
	});
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(10);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		Thread.sleep(2000);
		t3.start();
	}
}


