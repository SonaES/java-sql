package Collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();

		list.add("orange");
		list.add("apple");
		list.add("mango");
		list.add("grapes");
		list.set(1, "dates");
		
		System.out.println(list);
		System.out.println(list.get(1));
	}

}
