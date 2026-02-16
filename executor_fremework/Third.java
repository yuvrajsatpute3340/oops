package executor_fremework;

public class Third {

	static boolean flag=true;
	public static void main(String[] args) throws InterruptedException {
		
		Thread read=new Thread(()->{
			
			System.out.println("reading start");
			while(flag==true)
			{
				
			}
			System.out.println("reading operaction ended");
		});
		Thread write=new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("setting the flag to false");
			flag=false;
		});
		read.start();
		write.start();
        Thread.sleep(2000);
        System.out.println("main setting the flag to true");
        flag=true;
	}

}
