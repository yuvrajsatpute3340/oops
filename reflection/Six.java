package reflection;

import java.lang.reflect.Constructor;

public class Six {
    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("reflection.Employee");

        Constructor<?>[] constructors = c1.getDeclaredConstructors();
        for (Constructor<?> cons : constructors) {
            System.out.println("Constructor: " + cons);
            System.out.println("Parameter Count: " + cons.getParameterCount());
        }

       
        Constructor<?> cons = c1.getDeclaredConstructor(String.class, int.class);
        cons.setAccessible(true);

        Employe emp = (Employe) cons.newInstance("Rahul", 25);
        System.out.println("Employee Name: " + emp.name + ", Age: " + emp.age);
    }
}

class Employe {
    String name;
    int age;

    private Employe(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee object created via private constructor");
    }
}