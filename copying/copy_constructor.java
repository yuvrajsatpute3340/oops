package copying;

public class copy_constructor {

	public static void main(String[] args) {
		
		  Studentt s1 = new Studentt(1, "John");
	        Studentt s2 = new Studentt(s1);

	        s2.display();
	}

}
class Studentt {
    int id;
    String name;

    Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Studentt(Studentt s) {
        this.id = s.id;
        this.name = s.name;
    }

   public void display() {
        System.out.println(id + " " + name);
    }
}

