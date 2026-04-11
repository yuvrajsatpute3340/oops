package Collection_demo;

public class Imp9 {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java");
        Book b2 = new Book(101, "Java");

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        System.out.println(b1.equals(b2));
    }
}

class Book {
    int id;
    String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int hashCode() {
        return id;   // logical: based on unique id
    }

    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.id == b.id && this.title.equals(b.title);
    }
}