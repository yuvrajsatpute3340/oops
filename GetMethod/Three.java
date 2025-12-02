package GetMethod;

import java.lang.reflect.Method;

class Person {
    public String getName() {
        return "Rahul Patil";
    }
}

public class Three {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Person.class;

        Method m = cls.getMethod("getName");

        Person p = new Person();

        Object result = m.invoke(p);

        System.out.println("Name: " + result);
    }
}
