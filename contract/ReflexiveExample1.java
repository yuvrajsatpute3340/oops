package contract;

class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class ReflexiveExample1 {
    public static void main(String[] args) {
        Person p1 = new Person("Rahul");
        Person p2 = new Person("Rahul");
        Person p3 = new Person("Amit");

        System.out.println("Reflexive (p1 == p1): " + p1.equals(p1)); // true

        System.out.println("p1 equals p2: " + p1.equals(p2)); // true

        System.out.println("p1 equals p3: " + p1.equals(p3)); // false
    }
}
