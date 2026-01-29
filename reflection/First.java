package reflection;

import java.lang.reflect.Constructor;

public class First {

    public static void main(String[] args) throws Exception {

        Class<?> c1 = Class.forName("reflection.Student");

        Constructor<?>[] constructors = c1.getDeclaredConstructors();

        for (Constructor<?> c : constructors) {
            System.out.println("---------------");
            System.out.println(c);
            System.out.println("**********************");
            System.out.println(c.getName());
            System.out.println(c.getParameterCount());

            Class<?>[] pm = c.getParameterTypes();
            for (Class<?> p : pm) {
                System.out.println(p);
            }
            System.out.println("____________________________________");
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Constructor<?> cs2 = c1.getDeclaredConstructor(String.class);

        cs2.setAccessible(true);

        Student st = (Student) cs2.newInstance("Hello");
        System.out.println(st.s);
    }
}

class Student {
    String s;

    private Student(String s) {
        this.s = s;
        System.out.println("Object created using the private constructor..");
    }
}
