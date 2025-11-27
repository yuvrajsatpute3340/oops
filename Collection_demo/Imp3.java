package Collection_demo;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}

public class Imp3 {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", 25);
        Person p2 = new Person("Ravi", 25);

        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());

        System.out.println("p1.equals(p2): " + p1.equals(p2));
    }
}
