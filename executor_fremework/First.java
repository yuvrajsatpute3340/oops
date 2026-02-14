package executor_fremework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {

	public static void main(String[] args) {
		
		Runnable r1=()->{
			System.out.println("First Task");
			System.out.println(Thread.currentThread().getName()+"Working");
			int i=0;
			while (i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r2=()->{
			System.out.println("Second Task");
			System.out.println(Thread.currentThread().getName()+"Working");
			int i=0;
			while (i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r3=()->{
			System.out.println("Third Task");
			System.out.println(Thread.currentThread().getName()+"Working");
			int i=0;
			while (i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r4=()->{
			System.out.println("Fourth Task");
			System.out.println(Thread.currentThread().getName()+"Working");
			int i=0;
			while (i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r5=()->{
			System.out.println("Five Task");
			System.out.println(Thread.currentThread().getName()+"Working");
			int i=0;
			while (i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		try(ExecutorService ex=Executors.newFixedThreadPool(3);){
		ex.execute(r1);
				ex.execute(r2);
				ex.execute(r3);
				ex.execute(r4);
				ex.execute(r5);

	}
	catch(Throwable t)
	{
		System.out.println(t.getMessage());
	}

}
}
