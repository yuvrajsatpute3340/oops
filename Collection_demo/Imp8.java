package Collection_demo;

public class Imp8 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(1, "Rahul");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return 200;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }
}