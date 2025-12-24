package queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Four {

	public static void main(String[] args) {
		
		Deque<Integer>queue =new ArrayDeque<Integer>();
		
		queue.add(12);
		queue.add(23);
		queue.add(34);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}

}
