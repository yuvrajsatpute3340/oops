package listif;

import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(null);
		stack.push(34);
		stack.push(11);
		
		System.out.println(stack.search(11));
		
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack.pop());
		}
}
