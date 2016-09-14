import java.util.Random;
import java.lang.Math;
public class RandomNumbers
{
	public static void main (String[]args)
	{
		Random generator = new Random();
		
		//formula for random number using random class
		// r - generator.nextInt(n);
		//range of 0 to n-1
		
		int random1 = generator.nextInt(15);
		System.out.println(random1);
		// shift the range by adding or subtracting
		//range of 1-10
		
		int random2 = generator.nextInt(10) + 1;
		System.out.println(random2);
		
		// math class method
		
		double random3 = (int) (Math.random() * 10); // range of 0-9
		System.out.println(random3);

		// shift range
		double random4 = (int) (Math.random() * 10 + 1); // range of 1-10
		System.out.println(random4);
	}

	
}
