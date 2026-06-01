package Encapsulation;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setSalary(45000);
        System.out.println("Salary: " + emp.getSalary());
    }
}

class Employee {

    private double salary;

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    public double getSalary() {
        return salary;
    }
}