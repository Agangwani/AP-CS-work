import java.util.Scanner; 
import java.io.File;
import java.io.IOException;	
import java.text.DecimalFormat; 

public class Baseballstats
{
	public static void main (String[]args) throws IOException
	{
		Scanner fileScan = new Scanner(new File("Baseballstats.txt"));
		int hits = 0,outs = 0, walks = 0, sacrifices = 0;

		while (fileScan.hasNext())
			{
				String line = fileScan.nextLine();
				Scanner lineScan = new Scanner(line); 

				lineScan.useDelimiter(",");
				String name = lineScan.next();
				System.out.println(name);

				for(int i=name.length();i<line.length();i++)
				{
					if(line.charAt(i) == 'o') outs++;
					else if (line.charAt(i) == 'h') hits++;
					else if (line.charAt(i) == 'w') walks++;
					else if (line.charAt(i) == 's') sacrifices++;
				}

				DecimalFormat fmt=new DecimalFormat("0.000");
				double batAVG = (double) hits / (hits+outs);

				System.out.println(" hits: " + hits + " outs : " + outs + " walks: " + walks + " dsacrifices" + sacrifices + fmt.format(batAVG) );

				lineScan.close();
				hits =0;
				outs =0;
				walks =0;
				sacrifices =0;

			}

				


	}


}
