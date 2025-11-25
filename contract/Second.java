package contract;

import java.util.HashSet;
import java.util.Objects;

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);  
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return id == s.id && Objects.equals(name, s.name);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Second {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(101, "Amit");
        Student s3 = new Student(102, "Rahul");

        set.add(s1);
        set.add(s2);   
        set.add(s3);

        System.out.println("HashSet Elements:");
        for (Student s : set) {
            System.out.println(s + " | hashCode = " + s.hashCode());
        }
    }
}
