package setif;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_demo {

	public static void main(String[] args) {
		
		Flipkart_Order one=new Flipkart_Order(4567.678,4.4,5,"Aviator");
		Flipkart_Order two=new Flipkart_Order(4567.678,4.4,5,"Aviator");
		Flipkart_Order three=new Flipkart_Order(4567.678,4.4,5,"Aviator");
		
		TreeSet<Flipkart_Order> order=new TreeSet<Flipkart_Order>(new NameComparator());
		
		order.add(three);
		order.add(two);
		order.add(one);
		
		System.out.println(order);
		
	}
}
class Flipkart_Order implements Comparable<Flipkart_Order>
{
	double price;
	double ratings;
	int reviews;
	String order_item;
	
	public Flipkart_Order(double price,double ratings,int reviews,String order_item)
	{
		super();
		this.price=price;
		this.ratings=ratings;
		this.reviews=reviews;
		this.order_item=order_item;
	}

	@Override
	public int compareTo(Flipkart_Order o) {
		return Double.compare(this.price,o.price);
	}
	public String toString() {
		return this.order_item+" "+this.price+" "+this.ratings+" "+this.reviews;
	}	
}
class PriceComparator implements Comparator<Flipkart_Order >
{

	@Override
	public int compare(Flipkart_Order o1, Flipkart_Order o2) {
		return Double.compare(o2.price,o1.price);
	}
}
class ReviewComparator implements Comparator<Flipkart_Order>
{

	@Override
	public int compare(Flipkart_Order o1, Flipkart_Order o2) {
		return Integer.compare(o2.reviews,o1.reviews);
	}
}
class NameComparator implements Comparator<Flipkart_Order>
{

	@Override
	public int compare(Flipkart_Order o1, Flipkart_Order o2) {
		return o1.order_item.compareTo(o2.order_item);
	}
	
}