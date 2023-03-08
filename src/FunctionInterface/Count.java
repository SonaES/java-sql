package FunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Count {

	public static void main(String[] args) {
		List<String> s=Arrays.asList("sona","sam","athu","naznin","sona","sam");
		
		
		List<String> count= s.stream().filter(p->Collections.frequency(s,p)>1).collect(Collectors.toList());
		System.out.println(count);
		

	}

}
