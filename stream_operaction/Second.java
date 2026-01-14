package stream_operaction;

import java.util.List;
import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {
		
		Student first = new Student(1, "Yuvraj");
        Student second = new Student(2, "Rutuja");
        Student third = new Student(3, "Pooja");
        Student four = new Student(4,"Raj");

        List<Student> list2 = List.of(first, second, third ,four);

        Predicate<Student> pred = s -> s.name.length() < 7;

        list2.stream().filter(pred)
             .forEach(s -> {
                 System.out.println(s.id);
                 System.out.println(s.name);
                 System.out.println("---------------------------");
             });
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
