package Hashmap;


import java.util.HashMap;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		HashMap<Integer,Employee1>employee=new HashMap<>();
		
		
		Employee1 e=new Employee1(45,"sasi",44,"fruit");
		
		
		employee.put(1,e);
		int h=employee.hashCode();
		System.out.println(h);
		
		
		
	}

	
		
	}
	
	
	


