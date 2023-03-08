package FunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class City {

	public static void main(String[] args) {
		List<String> c=Arrays.asList("Thiruvella","tvm","kulathoor","kazhakoottam","thrissur");
		
		
		List<String> citynamelist=c.stream().filter(str->str.toLowerCase().startsWith("t")).collect(Collectors.toList());
		System.out.println(citynamelist);
	}

}