/* 
 * Paint.java
 * Find the dimensions of a room, the square footage of the room, and the total amount of paint 
 * needed to completely paint the room
 * 
 */

import java.util.Scanner;
public class Paint
{
	private static Scanner scan;

	public static void main (String[] args)
	{
		final int coverage = 350; // paint covers 350 sq ft/gal
			/* declare integers length, width, and height
			 * declare double totalSqFt
			 * declare double paintNeeded
			 * declare and initialize Scanner object
			 * Prompt for and read in the length of the room
			 * prompt for and read in the width of the room
			 * prompt for and read in the height of the room
			 * compute the total square feet to be painted, think about the dimensions of each wall
			 * compute the amount of paint needed
			 * print the length width and height of the room and the number of gallons of paint needed. 
			 */      
				
			int length, width,height, windows, doors;
			double totalSqFt, paintNeeded;
			scan = new Scanner (System.in);
			System.out.println("enter an length please");
			length = scan.nextInt();
			System.out.println("enter an width please");
			width = scan.nextInt();
			System.out.println("enter an height please");
			height = scan.nextInt();
			totalSqFt = 2*length*width + 2*width*height + 2*height*length;
			System.out.println("the total square footage of paint needed is " + totalSqFt);
			paintNeeded = totalSqFt/coverage;
			System.out.println("the total amount of paint needed is " + paintNeeded + " gallons of paint");
			System.out.println("enter the number of doors");
			doors = scan.nextInt();
			System.out.println("enter the number of windows");
			windows = scan.nextInt();
			int DoorSqFt = doors * 20;
			int WindowsSqFt = windows * 15;
			int DoorWindowSqFt = DoorSqFt + WindowsSqFt; 
			int paintNeeded2 = (int) ((totalSqFt-DoorWindowSqFt) / coverage);
			System.out.println ("The total square footage of paint needed with those doors and windows is " + (totalSqFt-DoorWindowSqFt));
			System.out.println ("The amount of paint needed with those doors and windows is " + paintNeeded2 + "gallons");
			
			
			
			
			

			
	}
	
}
