package executor_fremework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Six {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService ex=Executors.newCachedThreadPool();
		//ExecutorService ex=Executors.newFixedThreadPool(1);
		
		Callable<String>call=()->{
			Thread.sleep(5000);
			return "Ram Ram";
		};
		Callable<Integer>call1=()->{
			Thread.sleep(2000);
			return 500;
		};
		Callable<String>call2=()->{
			return "Sir jii";
		};
		Callable<Integer>call3=()->(200);
		
		Future<String>f=ex.submit(call);
		Future<Integer>f1=ex.submit(call1);
		Future<String>f2=ex.submit(call2);
		Future<Integer>f3=ex.submit(call3);
		
		ex.shutdown();
		
		System.out.println("All call print..");
		System.out.println(f.get());
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		
		

	}

}
