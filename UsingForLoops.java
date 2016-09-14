public class UsingForLoops
{
	public static void main (String[]args)
	{
		// Print Numbers 1 to 10
		for(int i=1; i <= 10; i =i+1)

		{

			System.out.print(i + " "); 

		}

		System.out.println();
		// Print Evens from 10 to 20

		for(int i=10; i <= 20; i+=2)

		{

			System.out.print(i + " ");

		}

		System.out.println();

		// Print individual letters of a string
		String word = "orion";

		for (int i = 0; i<word.length(); i++)
		{

			System.out.print(word.charAt(i) + " ");

		}

		System.out.println();

		// Print out Backwards Now

		for (int i = word.length()-1; i >= 0; i-=1)
		{

			System.out.print(word.charAt(i) + " ");

		}

		System.out.println();

		//Nested Loop

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j <=5; j++)
			{
				System.out.println("i " + i + " added to " + j + " is " + i+j);

			}


		}

			System.out.println();


	}
}