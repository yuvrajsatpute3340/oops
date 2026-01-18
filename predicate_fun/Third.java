package predicate_fun;

import java.util.function.Predicate;

class Employee {
    String name;
    double salary;
    int id;
    char a;
    float no;

    Employee(String name, double salary,int id,char a,float no) {
        this.name = name;
        this.salary = salary;
        this.id=id;
        this.a=a;
        this.no=no;
    }
}

public class Third {

    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 50000,10,'A',20);
        Employee e2 = new Employee("Bob", 40000,20,'B',30);
        Employee e3 = new Employee("Yuvi",30000,30,'C',40);

        Predicate<Employee> highSalary = e -> e.salary > 6000;

        System.out.println(highSalary.test(e1)); // true
        System.out.println(highSalary.test(e2)); // false
        System.out.println(highSalary.test(e3));
    }
}
