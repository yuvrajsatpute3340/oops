package copying;

public class copy_constructor4 {

	public static void main(String[] args) {
		
		Address addr = new Address("Delhi");
        Person p1 = new Person("Amit", addr);
        Person p2 = new Person(p1);  // Copy object

        p1.display();
        p2.display();
	}

}
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    Address(Address a) {   // Copy constructor
        this.city = a.city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    Person(Person p) {
        this.name = p.name;
        this.address = new Address(p.address);  // Deep copy
    }

    void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}
