package Class_demo;

public class City {

	public static void main(String[] args) {
		Shahar A=new Shahar();
		
		A.name="Latur";
		A.pincode="143143";
		
		Shahar B=new Shahar();

		A.name="Beed";
		A.name="431517";
		
		A.showdetails();
		B.showdetails();


	}

}
class Shahar
{
	String name;
	String pincode;
final String state="maharastra";
          public void showdetails() {
        }
      {
	       System.out.println(name);
	       System.out.println(pincode);
        	System.out.println(state);

     }
}

