package contract;

public class Eight {

    public static void main(String[] args) {

        collage clg1 = new collage(1, "xyz");
        collage clg2 = new collage(2, "xyz");
        collage clg3 = new collage(1, "xyz");

        System.out.println(clg1.equals(clg3));  // true
    }
}

class collage {

    String name;
    double id;

    public collage(double id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        collage clg = (collage) obj;

        return this.id == clg.id && this.name.equals(clg.name);
    }
}
