package Constructors;

public class Six {

    public static void main(String[] args) {
        Book book = new Book(200);
        book.display();
    }

}

class Bookk {
    double pri;

    public Bookk(double price) {
        pri = price;
        System.out.println(price);
        System.out.println("Good Morning!.....");
    }

    public Bookk() {
        System.out.println("Non param....");
    }

    public Bookk(char c, char d, int i) {
        System.out.println(c + "..." + d + i);
    }

    public void display() {
        System.out.println("The price of the book:" + pri);
    }
}