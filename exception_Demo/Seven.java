package exception_Demo;

public class Seven {

	public static void main(String[] args) {
		int i=51;
		try {
			if(i>50) {
				throw new carException(" that is not car");
			}
		}
		catch(carException ex){
			System.out.println(ex.getMessage());
		}

	}

}
class carException extends Exception{
	public carException(String str) {
		super(str);
	}
	
}