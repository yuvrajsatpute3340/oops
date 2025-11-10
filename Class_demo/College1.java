package Class_demo;

public class College1 {

	public static void main(String[] args) {
		College sndt=new College();
		College dscl=new College();
		College Kukana=new College();
		
		     sndt.id=100;
		     sndt.name="ABC";
		     sndt.pincode="111111";
		     
			 System.out.println("Sndt Data :");
			 System.out.println(sndt.id);
			 System.out.println(sndt.name);
			 System.out.println(sndt.pincode);
			 System.out.println("------------");

		     dscl.id=200;
		     dscl.name="XYZ";
		     dscl.pincode="222222";
		     
		 System.out.println("Dscl Data :");   
		 System.out.println(dscl.id);
		 System.out.println(dscl.name);  
		 System.out.println(dscl.pincode);
		 System.out.println("-------------");

		 Kukana.id=300;
		 Kukana.name="DEF";
		 Kukana.pincode="414604";
	     
		 System.out.println("Kukana Data :");
		 System.out.println(Kukana.id);
		 System.out.println(Kukana.name);
		 System.out.println(Kukana.pincode);
		 System.out.println("------------");

		// System.out.println(College.pincode);    
	}

}
class College
{
	int id;
	String name;
	static String pincode;
	
}
