package Abstraction;

public class Fifth {

	public static void main(String[] args) {
		UPI upi=new phonepay();
		upi.dopaymanet("1234567");
		System.out.println(upi.sendmassage("Hello"));
		System.out.println(upi.recivemessage());
		
		UPI.send();
		}
} 
interface UPI
{
	long dopaymanet(String str);
	String sendmassage(String str);
	default String recivemessage()
	{
		return "default behaviour";
	}
	static int send()
	{
		System.out.println("Hello Form UPI");
		return 12;
	}
}
class phonepay implements UPI
{

	@Override
	public long dopaymanet(String str) {
		System.out.println("Doing the payment :");
		return 123456;
	}

	@Override
	public String sendmassage(String str) {
		return "Recevied message is :"+str;
	}
	public String recivemessage()
	{
		return "Phonepay behaviour"; 
	}
	public int send()
	{
		System.out.println("Hello");
		return 123;
	}
	
}
