package hashSet;

class Bookk {
    int id;
    double price;

    public Bookk(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public String toString() {
        return "{" + this.id + " " + this.price + "}";
    }

    @Override
    public int hashCode() { 
        return this.id + (int)this.price;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.id == b.id && this.price == b.price;
    }
}