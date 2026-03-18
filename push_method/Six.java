package push_method;

public class Six {

    public static void main(String[] args) {
        StackString s = new StackString();
        s.push("Apple");
        s.push("Banana");
        s.push("Cherry");
    }
}

class StackString {
    String[] stack = new String[5];
    int top = -1;

    void push(String value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }
}