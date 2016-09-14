
public class Types 
{
	public static void main (String[]args)
	{
		//Rule 1. Integer division always results in an integer
		int result1;
		result1 = 3/2; 
		System.out.println(result1);
		double result2 = 3/2;
		System.out.println (result2);
		
		// rule 2 widening to a larger type is okay
		double theDoub;
		int theInt = 5;
		theDoub = theInt;
		System.out.println (theDoub);
		
		// rule 3 cast for a narrowing conversion even if data loss may occur
		theDoub = 27.5;
		// noiw put this into a smaller ty (int)
		theInt = (int) theDoub;
		System.out.println (theInt);
		
		
int x = 5;
int y = 4;
double res1 = x/y;
double res2 = (double)x/y;
System.out.println(res2);
		
		
		
	}
	
}
