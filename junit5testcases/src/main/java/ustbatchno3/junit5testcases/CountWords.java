package ustbatchno3.junit5testcases;

import java.util.Arrays;
import java.util.List;

public class CountWords {

	public static void main(String[] args) { 
	
		    	 	List<String> l1=Arrays.asList("as","df","as");
		    		long dupe=l1.stream().filter(name->name.equalsIgnoreCase("as")).count();
		    		System.out.println(dupe);
		    		
		    	}

}