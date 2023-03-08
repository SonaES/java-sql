package Collection;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();

		list.add("orange");
		list.add("apple");
		list.add("mango");
		list.add("grapes");
		list.remove(1);
		System.out.println(list.remove(0));
		System.out.println(list);
	}

}