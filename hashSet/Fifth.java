package hashSet;

import java.util.HashSet;

public class Fifth {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Amit");
        Student s3 = new Student(1, "Rahul"); // duplicate

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }
}