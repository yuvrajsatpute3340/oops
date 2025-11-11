package Abstraction; 

public class First {
    public static void main(String[] args) {
        Animal animal1 = new Elephant(); // Fixed variable declaration
        Animal animal2 = new Cheetah();  // Fixed class name (Chettah → Cheetah)

        animal1.eat("grass");
        animal2.eat("carniveroes");
    }
}

abstract class Animal {
    public void run() {
        System.out.println("Run fast...");
    }

    abstract void eat(String str);

    public Animal() {
        System.out.println("hello");
    }
}

class Elephant extends Animal {
    void eat(String str) {
        System.out.println("Elephant is Eating: " + str);
    }
}

class Cheetah extends Animal { // Fixed class name spelling
    void eat(String str) {
        System.out.println("Cheetah is Eating: " + str);
    }
}
