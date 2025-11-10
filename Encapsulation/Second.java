package Encapsulation;

public class Second {

	public static void main(String[] args) {
		Business alovera=new Business();
		alovera.setTunrover(101);
		System.out.println(alovera.getTurnover());
		alovera.setGstnumber("GST123456789");
		System.out.println(alovera.getgstnumber());
	}

}
class Business
{
	private double turnover;
	private String gstnumber;
	
	public void setTunrover(double turnover)
	{
		if(turnover<100)
		{
			System.out.println("less than 100");
		}
		else
		{
			this.turnover=turnover;
		}
	}
	
	public double getTurnover()
	{
		return this.turnover;
	}
	public void setGstnumber(String gstnumber)
	{
		if(gstnumber.length()==10)
		{
			this.gstnumber=gstnumber;
		}
		else
		{
			System.out.println("please enetr the valid GST number");
		}
	}
	public String getgstnumber()
	{
		return this.gstnumber;
	}
}

