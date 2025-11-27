package contract;

class Person5 {
    private String name;

    public Person5(String name) {
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

public class ConsistentExample {
    public static void main(String[] args) {

        Person p1 = new Person("Rahul");
        Person p2 = new Person("Rahul");

        System.out.println("First call: " + p1.equals(p2));   // true
        System.out.println("Second call: " + p1.equals(p2));  // true
        System.out.println("Third call: " + p1.equals(p2));   // true
    }
}
