package Class_demo;

public class Car1 {

	public static void main(String[] args) {
		//int age=34;
		Car2 hyundai=new Car2();
		   hyundai.mileage=45;
		   hyundai.price=45;
		Car2 skoda=new Car2();
		   skoda.mileage=45;
		   skoda.price=45;
		   
		System.out.println( hyundai.mileage);     
		System.out.println( skoda.mileage); 
		System.out.println( skoda.price);    
		
		   Track hyva=new Track();
		   hyva.tyres=14;
		System.out.println(hyva.tyres);   
	}

}
class Car2
{
	//int hyundai;
	int mileage;
	double price;
}
class Track
{
	int tyres;
}
