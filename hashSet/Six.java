package hashSet;

import java.util.HashSet;

public class Six {
    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(2, "Amit");
        Employee e3 = new Employee(1, "Rohan"); // same id → duplicate

        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set);
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id;
    }
}