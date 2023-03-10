package ustbatchno3.junit5testcases;


	import java.time.LocalDate;

	
	public class Empgoldcoins {

		public String  findcoins(LocalDate date) {
			int dayOfYear =date.getDayOfYear();
			
			if (dayOfYear<80||dayOfYear>365) {
				return "*****";
			}else if (dayOfYear<172) {
				return "***";}
				else if(dayOfYear<266)
				{
					return"*";
				}
				else if (dayOfYear<365)
				{
					return " ";
				}
				return "0";
			
		}}

	;	