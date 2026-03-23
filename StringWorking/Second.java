package StringWorking;

public class Second {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(1, "Rahul"),
            new Student(2, "Amit"),
            new Student(3, "Sneha"),
            new Student(4, "Pooja"),
        };

        System.out.println(arr[0].getName());
        System.out.println(arr[1].getName());
        System.out.println(arr[2].getName());
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
