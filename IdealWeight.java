/*
 * FInd the ideal weight of a female and male given a certain height 
 */
import java.util.Scanner;
public class IdealWeight

{
	private static Scanner scan;

	public static void main (String[]args)
	{
		scan = new Scanner (System.in);

		System.out.println("please enter your height in feet ");
		int heightFeet = scan.nextInt();
		System.out.println("please enter your height in inches");
		int heightInch = scan.nextInt();
		int Totalheight =  (heightFeet * 12) + heightInch;
		int MaleExtraHeight =  (Totalheight-60);
		int FemaleExtraHeight =  (Totalheight-60);		
		int MaleExtraWeight = MaleExtraHeight*6;
		int FemaleExtraWeight = FemaleExtraHeight*5;
		int MaleWeight = MaleExtraWeight + 106;
		int FemaleWeight = FemaleExtraWeight + 100;
		System.out.println("A female with your height should weigh " + FemaleWeight);
		System.out.println("A male with your height should weigh " + MaleWeight);
		
		
				}
		
	}
	
