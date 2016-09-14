import java.util.Scanner; 
public class WhileLoopDemo2
{
	public static void main (String[] args)
	{
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println ("enter an integer and I will compute its square" + "(-1 to quit)");
		input = scan.nextInt();
		while (input != -1)
		{
			System.out.println(input +  " squared is" +(input *input));
			System.out.println(" enter another or -1 to quit ");
			input = scan.nextInt();

		}
	}
}