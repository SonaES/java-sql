package ustbatchno3.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_construction {

	public static void main(String[] args) {
		List<Construction> c = new ArrayList <Construction>();  
        //Adding Products  
        c.add(new Construction ("tvm",1600,800)); 
        c.add(new Construction ("chennai",1800,1000)); 
        c.add(new Construction ("hyderabad",2000,900)); 
        c.add(new Construction ("mumbai",2500,1200)); 
        c.add(new Construction ("kochi",1800,1200)); 
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter square feet");
		int sq,price=0;
		sq=sc.nextInt();
		System.out.println("Enter city");
		String city=sc.next();
		city.toLowerCase();
		int choice=0;
		System.out.println("Enter choice\n1-Price without material\n2-Price with material");
		choice=sc.nextInt();
		sc.close();
		price=construction(c, choice, city, sq);
		
		System.out.println("Total price : "+price);
   
}
	public static int  construction(List<Construction> c,int choice,String city,int sq) {
		List<Construction> result=c.stream().filter(t->(t.getCity().equals(city))).toList();
		if(result.isEmpty()) {
			System.out.println("city not found!!!");
			
		}
	int price=0;
	switch(choice) {
	case 1:for(Construction p:result) 
				price=(p.getPrice_with()*sq);
				break;
	case 2:for(Construction p:result) 
				price=(p.getPrice_without()*sq);
				break;}
	return price;
}
}


