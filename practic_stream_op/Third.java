package practic_stream_op;

import java.util.Arrays;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		
		Demo first = new Demo(20, "yuvi", 10);
        Demo second = new Demo(30, "raj", 10);
        Demo third = new Demo(40, "satpute", 10);

        List<Demo> list = Arrays.asList(first, second, third);

        list.stream()
            .sorted((i, j) -> Integer.compare(j.id, i.id)) 
            .skip(2)
            .limit(1)
            .forEach(System.out::println);
 
	}

}
class Demo{
	int id;
	String name;
	int no;
	
	public Demo (int id,String name,int no)
	{
		this.id=id;
		this.name=name;
		this.no=no;
	}
}

