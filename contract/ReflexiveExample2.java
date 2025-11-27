package contract;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Person p = (Person) obj;
        return this.name.equals(p.name);
    }
}

public class ReflexiveExample2 {
    public static void main(String[] args) {

        Person p1 = new Person("Rahul");

        System.out.println("Reflexive: " + p1.equals(p1)); 
        }
}
