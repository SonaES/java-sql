package FunctionInterface;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Square {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(3,5,6,8,2,4);
		
		
		List<Integer> squarenumberlist=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(squarenumberlist);

	}

}
