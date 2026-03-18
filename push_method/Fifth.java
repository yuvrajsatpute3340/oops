package push_method;

public class Fifth {

    public static void main(String[] args) {
        StackInt s = new StackInt();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
    }
}

class StackInt {
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