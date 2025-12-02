package GetMethod;

import java.lang.reflect.Method;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Second {
    public static void main(String[] args) throws Exception {
        
        Class<?> c = Calculator.class;

        Method m = c.getMethod("add", int.class, int.class);

        Calculator obj = new Calculator();

        Object result = m.invoke(obj, 5, 7);

        System.out.println("Addition Result = " + result);
    }
}
