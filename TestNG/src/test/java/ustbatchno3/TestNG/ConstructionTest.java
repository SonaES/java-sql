package ustbatchno3.TestNG;



import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;



import org.testng.annotations.Test;

public class ConstructionTest {
      @Test
      public void Construction(){
    	  int expected =2000;
    	  
    	  Construction c1=new Construction("Hyderabad", 2000, 900);
    	  String city="Hyderabad";
    	  List<Construction> details=Arrays.asList(c1);
    	  int ch=1,sq=1;
    	  
    	  assertEquals(expected,Main_construction.construction (details, ch, city, sq));
    	  ch=2;
    	  
    	  expected=900;
    	  assertEquals(expected, Main_construction.construction(details, ch, city, sq));
    	  
      }
}
