package predicate_fun;

import java.util.function.Predicate;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Third {

    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 60000);
        Employee e2 = new Employee("Bob", 40000);

        Predicate<Employee> highSalary = e -> e.salary > 50000;

        System.out.println(highSalary.test(e1)); // true
        System.out.println(highSalary.test(e2)); // false
    }
}
