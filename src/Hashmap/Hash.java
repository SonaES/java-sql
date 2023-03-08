package Hashmap;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("sona", 22);
		map.put("sam", 23);
		map.put("athu", 24);
		int age=map.get("sona");
		System.out.println(age);
		map.remove("athu");
		System.out.println(map);
		
	}

}
