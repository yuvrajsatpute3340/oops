package Synchronized;

public class Seven {

	static boolean flag=true;
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(()->{
			System.out.println("Thread Start");
			while (flag)
			{
				System.out.println("hello");
				//System.out.println("***************");
			}
			System.out.println("ended....");
		});
		t1.start();
		System.out.println("**********");
		System.out.println(flag);
		Thread.sleep(2000);
		
		flag=false;
		System.out.println(flag);

	}

}
