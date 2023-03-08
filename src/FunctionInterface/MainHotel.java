package FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainHotel {

	public static void main(String[] args) {
		List<Hotel> h = new ArrayList <Hotel>();  
        //Adding Products  
        h.add(new Hotel ("zam zam"," kazhakoottam", 1000)); 
        h.add(new Hotel ("sharavana bhavan"," kulathoor", 1500)); 
        h.add(new Hotel ("halais"," thamburanmuk", 500)); 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the budget");
		int budget=sc.nextInt();
		
        
        List<Hotel> ho=h.stream()
        		.filter(val->val.getBudget()<budget)
        		.collect(Collectors.toList());
        
        System.out.println(ho);
        
        
		System.out.println("enter the name");
		int name=sc.nextInt();
		
		
		System.out.println("enter the email");
		int email=sc.nextInt();
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		
		
        
        
       
        
	}

}
