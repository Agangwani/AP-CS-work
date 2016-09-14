/* 
 * Find the dimensions of a circle and the radius and circumfrence, and
 * by what factor much each changed by
 */

import java.util.Scanner;
public class Circle 

{
	private static Scanner scan;

	public static void main(String[]args)
	{
		// initial
		final double PI = 3.14159;
		int radius = 10;
		double area1 = PI *radius *radius;
		System.out.println("The area of a circle with radius " +radius + " is " + area1);
		radius = 20;
		double area2 = PI*radius*radius;
		System.out.println("The area of a circle with radius " + radius +  " is " + area2);
		// problem 1
		double PI2 = 3.14159;
		int radius2 = 10;
		double circumfrence1 = 2*PI2*radius2;
		System.out.println("The circumfrence of a circle with radius " +radius2 + " is " + circumfrence1);
		radius2 = 20;
		double circumfrence2 = 2*PI2*radius2;
		System.out.println("The circumfrence of a circle with radius " + radius2 +  " is " + circumfrence2);
		// problem 2
		double area3 = area2 / area1; 
		double circumfrence3 = circumfrence2 / circumfrence1; 
		System.out.println("The change in area was " + area3);
		System.out.println("The change in circumfrence was" +circumfrence3);
		scan = new Scanner(System.in);
		System.out.println("Enter any radius.");
		int radius3 = scan.nextInt();
		int radius4 = radius3*2;
		double circumfrence4 = 2*PI*radius3;
		double circumfrence5 =  2*PI*radius4;
		double area4 = PI*radius3*radius3;
		double area5 = PI*radius4*radius4;
		double circumfrence6 = circumfrence5/circumfrence4;
		double area6 = area5/area4;
		System.out.println("the circumfrence of the circle with the initial radius is " + circumfrence4);
		System.out.println("the circumfrence of the circle with twice the initial radius is " + circumfrence5 );
		System.out.println("the area of the circle with the initial radius is " + area4);
		System.out.println("the area of the circle with twice the initial radius is " + area5 );
		System.out.println(" the change in the circumfrence was " + circumfrence6);
		System.out.println("The change in the area was " + area6);
	
	
	}
	
	
}
