package listif;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List <String>list=new ArrayList<String>();
		
		list.add("Yuvraj");
		list.add("Aaradhy");
		list.add("Amar");
		list.add("Abhi");
		list.add("Avi");
		list.add("Yuvraj");
		list.lastIndexOf(list);
		
		System.out.println(list);
		
	}

}
