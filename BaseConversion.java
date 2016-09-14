/*
 * Convert base 10 numbers to another base. 
 */

import java.util.Scanner;
public class BaseConversion

{
	public static void main (String[]args)
{
		// initialize variables
		int base;
		int base10Num;
		int maxNumber;
		int place0;
		int place1;
		int place2;
		int place3;
		String baseBNum = new String ("");
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println();
		System.out.println("Enter a base (2-9) : ");
		base = scan.nextInt();
		System.out.print ("Enter a base 10 number to convert to : " );
		base10Num = scan.nextInt();
		// compute
		int quotient;
		place0 = base10Num % base ;
		quotient = base10Num / base ;
		place1 = quotient % base ;
		quotient = quotient / base ;
		place2 = quotient % base ;
		quotient = quotient / base ;
		place3 = quotient % base ;
		quotient = quotient / base ;
		baseBNum = "" + place3 + place2 + place1 + place0 ;
		// print
		System.out.println(" This value is your base ten number in base " + base + " number " + baseBNum);
		
}
	
}
