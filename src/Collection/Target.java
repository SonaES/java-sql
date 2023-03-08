package Collection;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Target {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(45);
		for(int i=0;i<9;i++) {
			for(int j=1;j<9;j++) {
				if((list.get(i)+list.get(j))==25) {
					System.out.println(list.get(i));
					System.out.println(list.get(j));
					break;
			}
		}
				
	}
}
			
				

	}
