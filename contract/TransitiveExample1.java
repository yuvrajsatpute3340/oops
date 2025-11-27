package contract;

class Person4 {
    private String name;

    public Person4(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;        
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name);
    }
}

public class TransitiveExample1 {
    public static void main(String[] args) {
        Person p1 = new Person("Rahul");
        Person p2 = new Person("Rahul");
        Person p3 = new Person("Rahul");

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p2.equals(p3): " + p2.equals(p3)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // true (Transitive)
    }
}
