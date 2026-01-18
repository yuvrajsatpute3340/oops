package push_method;

public class Fourth {

	public static void main(String[] args) {
		
		 StackExample s = new StackExample();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	    }
	}

		class StackExample {
		    int[] stack = new int[5];
		    int top = -1;

		    void push(int value) {
		        if (top == stack.length - 1) {
		            System.out.println("Stack Overflow");
		            return;
		        }
		        top++;
		        stack[top] = value;
		        System.out.println(value + " pushed into stack");
		    }

		       
}