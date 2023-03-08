package FunctionInterface;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Wordcount{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String article=sc.nextLine();
		String[] articletoWord =article.split( "[,;:?! ]" );
		List<String> thewords=Arrays.stream(articletoWord).filter(val->!val.isEmpty()).collect(Collectors.toList());
		List<String> theunique=thewords.stream()
				.map(val->val.toLowerCase())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
				System.out.println("number of  words:"+thewords.size());
				System.out.println("number of unique:"+theunique.size());
				System.out.println(theunique);
	
	
	
	
	
	
	}
}