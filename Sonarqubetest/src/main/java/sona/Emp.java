
package sona;
import java.util.logging.Logger;


import java.util.Arrays;
import java.util.List;

public class Emp {

		
		private static final Logger LOGGER = Logger.getLogger(Emp.class.getName());
		public static void main(String[] args) {
			Empde e1 = new Empde("Sasi", 105, 3, 20000);
			Empde e2 = new Empde("Kevin", 22, 3, 1912000);
			Empde e3 = new Empde("Messi", 34, 7, 1200000);
			Empde e4 = new Empde("Abu", 22, 9, 240000);
			Empde e5 = new Empde("Rock", 65, 26, 2000);
			List<Empde> ex = Arrays.asList(e1, e2, e3, e4, e5);
			for(Empde t:ex)
			{
				if ((t.getNoofyears() >= 1) && (t.getNoofyears() <= 3))
					t.setSalary(t.getSalary() + (t.getSalary() * (0.025)));
				else if ((t.getNoofyears() >= 3) && (t.getNoofyears() <= 6))
					t.setSalary(t.getSalary() + (t.getSalary() * .05));
				else if ((t.getNoofyears() >= 6) && (t.getNoofyears() <= 10))
					t.setSalary(t.getSalary() + (t.getSalary() * .1));
				else if ((t.getNoofyears() >= 10))
					t.setSalary(t.getSalary() + (t.getSalary() * .12));
				
			}
			  ex.forEach(i -> LOGGER.info("\n Name:" + i.getName()+" age:"+i.getAge()+" year:"+i.getNoofyears()+" Salary:"+i.getSalary()));
			
		}

	}

