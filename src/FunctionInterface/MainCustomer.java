package FunctionInterface;


import java.util.Collections;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class MainCustomer {

	public static void main(String[] args) {
		List<Customer> c = new ArrayList <Customer>();  
        //Adding Products  
        c.add(new Customer (1,"sona",987654321,"sona@gmail.com","ponnani")); 
        c.add(new Customer (2,"sam",987654322,"sam@gmail.com","mlpm")); 
        c.add(new Customer (3,"athulya",987654323,"athu@gmail.com","kkm")); 
        c.add(new Customer (4,"naz",987654324,"naz@gmail.com","tvm")); 
        c.add(new Customer (5,"lachu",987654325,"lax@gmail.com","athani")); 
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
      List<Customer> cu=c.stream()
    		  .filter(val->(val.getRegid())==id)
    		  .collect(Collectors.toList());
      if(cu.isEmpty()) {
    	  System.out.println("no record");
      }  else
    		  System.out.println(cu);
      
	
      
    	 
      
	}
}

