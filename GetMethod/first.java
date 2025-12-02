package GetMethod;

import java.lang.reflect.Method;

class Demo {
    public void show() {
        System.out.println("Show Method Called");
    }
}

public class first {
    public static void main(String[] args) throws Exception {

        Class<?> c = Demo.class;

        Method m = c.getMethod("show");

        System.out.println("Method Name: " + m.getName());

        Demo obj = new Demo();

        m.invoke(obj);
    }
}
