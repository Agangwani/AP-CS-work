import java.util.Scanner;

public class ReadingInput
{
	//Step 1 inport the scanner class
	// step 2 create an object of the scanner class
	// step 3 prompt the user to enter somethying
	// step 4 read the input and store in a variable by 
	// step 5 invoke a methode of a scanner object
	// step 6 close the scanner class
	public static void main (String[]args)
	{
	Scanner scan = new Scanner (System.in);
	System.out.println("enter an integer please");
	
	int input = scan.nextInt();
	int input3 = input*input*input; 
	System.out.println("you entered " +input);
	System.out.println("your number cubed is " +input3);
	scan.close();
	}
}
