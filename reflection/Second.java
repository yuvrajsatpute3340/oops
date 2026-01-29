package reflection;

import java.lang.reflect.Constructor;

public class Second {

    public static void main(String[] args) throws Exception {

        Class<?> c1 = Class.forName("java.lang.String");

        Constructor<?>[] CS = c1.getDeclaredConstructors();
        System.out.println(CS.length);

        for (Constructor<?> c : CS) {
            System.out.println("----------------");
            System.out.println(c);
            System.out.println("----------------");
        }

        Constructor<?> CS3 = c1.getDeclaredConstructor(char[].class);

        String s = (String) CS3.newInstance(new char[] { 'a', 'b' });

        System.out.println(s.toLowerCase());
    }
}
