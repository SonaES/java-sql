package ustbatchno3.junit5testcases;

	import static org.junit.Assert.assertEquals;

	import java.time.LocalDate;
	import java.util.Arrays;
	import java.util.List;

	import org.junit.Test;

	public class TextileDataTest {

		@Test
		 public void test() {
			List expected=Arrays.asList("50","t-shirt","5000");
			List actual1=TextileData.item(LocalDate.of(2023, 2, 1));
			 assertEquals(expected,actual1);
			
		}
	}



