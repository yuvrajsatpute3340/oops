package push_method;

public class Seven {

    public static void main(String[] args) {
        StackPerson s = new StackPerson();
        s.push(new Person("Alice", 25));
        s.push(new Person("Bob", 30));
        s.push(new Person("Charlie", 35));
    }
}

class StackPerson {
    Person[] stack = new Person[5];
    int top = -1;

    void push(Person value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
