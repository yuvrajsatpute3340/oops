package copying;

public class copy_constructor1 {

	public static void main(String[] args) {
		
		 Rectangle r1 = new Rectangle(10, 5);
	        Rectangle r2 = new Rectangle(r1);

	        System.out.println("Area: " + r2.area());
	}

}
class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Copy Constructor
    Rectangle(Rectangle r) {
        length = r.length;
        width = r.width;
    }

   public int area() {
        return length * width;
    }
}
