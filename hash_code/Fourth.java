package hash_code;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return id == student.id && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}

public class Fourth {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(1, "Alice");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
    }
}
