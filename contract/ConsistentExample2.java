package contract;

class Book1 {
    private String title;

    public Book1(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                
        if (obj == null || getClass() != obj.getClass()) return false;
        Book1 other = (Book1) obj;
        return this.title.equals(other.title);
    }
}

public class ConsistentExample2 {
    public static void main(String[] args) {

        Book1 b1 = new Book1("Java Programming");
        Book1 b2 = new Book1("Java Programming");

        System.out.println("Call 1: " + b1.equals(b2)); // true
        System.out.println("Call 2: " + b1.equals(b2)); // true
        System.out.println("Call 3: " + b1.equals(b2)); // true

    }
}

