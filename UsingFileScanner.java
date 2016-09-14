import java.util.Scanner; 
import java.io.File;
import java.io.IOException;	
public class UsingFileScanner

{
	public static void main (String[] args) throws IOException
	{
		/*
		Scanner fileScan1 = new Scanner(new File("words1.txt"));
		while(fileScan1.hasNext())
		{
			//no delimiter  needed because space is used here
						String word = fileScan1.next();
			System.out.print(word + ""); 
			

			fileScan1.useDelimiter(",");
			String word = fileScan1.next();
			System.out.print(word + "");
			System.out.println(); 
		}

			*/

			Scanner fileScan2 = new Scanner(new File("words2.txt"));


			while (fileScan2.hasNext())
			{
				String line = fileScan2.nextLine();
				Scanner lineScan = new Scanner(line); 

				lineScan.useDelimiter(", ");
				String name = lineScan.next();

				double grades = 0; 
				int count = 0;

				while(lineScan.hasNextDouble())
				{
					double grade = lineScan.nextDouble();
					grades += grade; 
					count ++;

				}

				System.out.println(name + "has test average of " +(grades/count) );



			}

			




		
	}
}