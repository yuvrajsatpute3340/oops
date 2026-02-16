package executor_fremework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Second {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex=Executors.newFixedThreadPool(1);
		
		Callable<String>call=()->{
			Thread.sleep(5000);
			return "yuvraj";
		};
		Callable<String> call2=()->("abcd");
		Callable<String> call3=()->("ABCD");
		
		Future<String> f=ex.submit(call);
		
		Future<String>f2=ex.submit(()->{System.out.println("run method");},"hello");
		
		ex.shutdown();
		
		System.out.println(f.get());
		System.out.println(f2.get());
		}

	}


