package executor_fremework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fifth {

	public static void main(String[] args) {
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		Runnable run=()->{
			System.out.println(Thread.currentThread().getName()+"Set1");
		};
		Runnable run1=()->{
			System.out.println(Thread.currentThread().getName()+"Set2");
		};
		Runnable run2=()->{
			System.out.println(Thread.currentThread().getName()+"Set3");
		};
		Runnable run3=()->{ 
			System.out.println(Thread.currentThread().getName()+"Set4");
		};
		ex.execute(run3);
		ex.execute(run2);
		ex.execute(run1);
		ex.execute(run);
		ex.shutdown();
	}
	
}
