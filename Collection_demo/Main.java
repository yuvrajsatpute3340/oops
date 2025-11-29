package Collection_demo;

class Demo {
    String value;

    Demo(String value) {
        this.value = value;
    }
    @Override
    public int hashCode() {
        return 100;  
    }

    @Override
    public String toString() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo("A");
        Demo d2 = new Demo("B");

        System.out.println("d1.hashCode(): " + d1.hashCode());
        System.out.println("d2.hashCode(): " + d2.hashCode());

        java.util.HashSet<Demo> set = new java.util.HashSet<>();
        set.add(d1);
        set.add(d2);

        System.out.println("HashSet elements: " + set);
    }
}
