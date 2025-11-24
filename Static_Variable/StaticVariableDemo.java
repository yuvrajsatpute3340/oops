package Static_Variable;

class Student {
	static String schoolName = "ABC School";

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + schoolName);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        s1.display();
        s2.display();
    }
}
