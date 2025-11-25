package contract;

import java.util.HashSet;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;  
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Third {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(1, "Amit");  
        Student s3 = new Student(2, "Rahul");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("HashSet:");
        for (Student s : set) {
            System.out.println(s + "  | hash = " + s.hashCode());
        }
    }
}
