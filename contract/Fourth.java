package contract;

import java.util.HashSet;
import java.util.Objects;

class Employee {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, empName);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee e = (Employee) obj;
        return empId == e.empId && empName.equals(e.empName);
    }

    @Override
    public String toString() {
        return empId + " - " + empName;
    }
}

public class Fourth {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        Employee e1 = new Employee(10, "Rohan");
        Employee e2 = new Employee(10, "Rohan");  
        Employee e3 = new Employee(20, "Sagar");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        for (Employee e : employees) {
            System.out.println(e + " | hash = " + e.hashCode());
        }
    }
}

