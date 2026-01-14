package practic_stream_op;

import java.util.List;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
     Collage first = new Collage(20, "Polic", 10.34);
     Collage second = new Collage(30, "Air force", 10.34);
   Collage third = new Collage(40, "NDA", 10.34);

		        List<Collage> list2 = List.of(first, second, third);

		        Predicate<Collage> pred = s -> s.name.length() < 5;

		        list2.stream().filter(pred).forEach(s -> {
		                 System.out.println(s.id);
		                 System.out.println(s.name);
		                 System.out.println(s.price);
		                 System.out.println("---------------------------");
		             });
		    }
		}

		class Collage {
		    int id;
		    String name;
		    double price;

		    public Collage(int id, String name, double price) {
		        this.id = id;
		        this.name = name;
		        this.price = price;
		    }
		}
