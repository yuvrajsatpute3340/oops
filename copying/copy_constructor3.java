package copying;

public class copy_constructor3 {

	public static void main(String[] args) {
		
		Student4 s1 = new Student4("Rahul", 20);
        Student4 s2 = new Student4(s1);  // Copying object

        s1.display();
        s2.display();
		
	}

}
class Student4 {
    String name;
    int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student4(Student4 s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
