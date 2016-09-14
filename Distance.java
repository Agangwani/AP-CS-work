import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

// Calculate the Distance between 2 sets of points
public class Distance
{

	public static void main (String[]args)
	{
		int x1, y1, x2, y2;
		double distance;
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter the first coordinate values");
		x1 = input.nextInt();
		y1 = input.nextInt();
		System.out.println("Enter the second coordinate values");
		x2 = input.nextInt();
		y2 = input.nextInt();
		distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println(" the distance between your points is " + distance);
		
	}
}
