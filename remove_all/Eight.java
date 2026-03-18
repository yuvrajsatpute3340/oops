package remove_all;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class Eight {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Alice", 25));
        list1.add(new Person("Bob", 30));
        list1.add(new Person("Charlie", 35));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Bob", 30));

        list1.removeAll(list2);

        System.out.println(list1); // Output: [Alice(25), Charlie(35)]
    }
}
