package Class_demo;

public class Employee {

    String name;
    int id;
    String companyname = "TechCorp";

    public Employee(String employeeName, int employeeId) {
        name = employeeName;
        id = employeeId;
    }

    void displayDetails() {
        String department = "Development";
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Company: " + companyname);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1001);
        Employee e2 = new Employee("Bob", 1002);

        System.out.println("----- Employee 1 -----");
        e1.displayDetails();

        System.out.println("----- Employee 2 -----");
        e2.displayDetails(); 
    }
}


