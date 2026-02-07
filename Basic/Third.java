package Basic;

public class Third {

	public static void main(String[] args) {
	
		
		Thread one =new Thread(()->{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println(3*i);
		}
			
		});
		one.start();
		System.out.println(Thread.currentThread().getName()+"re");
		Thread two=new Thread(()->{
			int counter=1;
			while(counter<100)
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println(counter);
				counter++;
			}
		});
		two.run();
	}
}
