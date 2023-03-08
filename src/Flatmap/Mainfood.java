package Flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mainfood {
	public static void  main(String[] args) {
		Food l1 = new Food("veg meals",80,1);
		Food l2 = new Food("fish curry meals",120,2);
		Food l3 = new Food("chapathi veg curry",40,3);
		Food l4 = new Food("chapathi chicken curry",120,4);
		Food l5 = new Food("veg fried rice",60,5);
		Food l6 = new Food("chicken fried rice",150,6);
		
		List<Food> ls = Arrays.asList(l1,l2,l3,l4,l5,l6);
		//ls.forEach(t->System.out.println(t));
		
		Scanner n = new Scanner(System.in);
		//String nme;
		Employee e = new Employee(0,null);
		System.out.println("Enter Details : \n\n");
		System.out.println("Enter name : ");
		e.setName(n.next());
		System.out.println("\nEnter uid : ");
		e.setUid(n.nextInt());
		List<Employee> em = Arrays.asList(e);
		em.forEach(t->System.out.println(t));
		int ans,ch;
		do {
		System.out.println("\nFood Details\n\n");
		ls.forEach(t->System.out.println(t.getId()+" "+t.getFoodname()+" "+t.getPrice()+"\n"));
		System.out.println("Choose your choice : \n");
		ch = n.nextInt();
		System.out.println("\nDo you want to change ? 0 for yes 1 for no (0/1)");
		ans = n.nextInt();
		}while(ans==0);
		int a = ch;
		List<Food> lss = ls.stream().filter(t->t.getId()==a).toList();
		System.out.println("\nThe Details are : \n");
		em.forEach(t->System.out.println("UID: "+t.getUid()+"\n"+"Name : "+t.getName()));
		lss.forEach(t->System.out.println("Food Name : "+t.getFoodname()+"\n"+"Food Price : "+t.getPrice()));
		n.close();
		}

}

        		
        		
  
	




