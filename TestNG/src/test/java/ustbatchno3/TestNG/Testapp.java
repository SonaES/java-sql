package ustbatchno3.TestNG;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Testapp {

	@Test
	public void testforEmployee(){
		
		App a=new App("SONA",22,"JAVAA");
		 assertEquals(a.getName(),"SONA");
		
	}
	
	
}
