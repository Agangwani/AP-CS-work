import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
// Calculate the area of a triangle using Herons formula
public class HeronsFormulaTriangle 
{
	public static void main (String[]args)
	{
		int a,b,c;
		double  area,s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter values for the sides of a trainge ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		s = a + b + c;
		area = Math.sqrt(s*(s-a) * (s-b) * (s-c) );
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println("The area of the triangle is " + fmt.format(area));
		
		
	}
}
