package Linkedlist;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;


public class Middle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String>mylist =new LinkedList<String>();
		for(int index=0;index<7;index++) {
			System.out.println("enter the element("+(index+1)+"):");
			mylist.add(sc.next());
			
		}
		System.out.println("size"+mylist.size());
		System.out.println("middle node"+mylist.get(mylist.size()/2));

	}

}
