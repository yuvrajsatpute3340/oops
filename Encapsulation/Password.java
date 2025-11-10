package Encapsulation;

public class Password {

	public static void main(String[] args) {
		Instagram yuvraj =new Instagram();
		yuvraj.setpassword("abc");
		System.out.println(yuvraj.getpassowd());
	}

}
class Instagram
{
	private String password;
	private String username;
	
	public void setpassword(String password)
	{
		if(password.contains("@q"));
		{
			this.password=password;
		}
		
		{
			System.out.println("Weak password...");
		}
	}
	public String getpassowd()
	{
		return this.password;
	}
}