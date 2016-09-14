public class WhileLoopWorksheet
{
	public static void main(String[]args)
	{
		/*
		double num = 24.0;

		while(num <= 32)
		{
			System.out.print(num + " ");
			num += 1.25;
		}

		out.System.println();

		int m = 30, n = 80;
		while (m<=200 && n>20)
		{
			System.out.println(m+ " and " + n );
			m += 15;
			n -= 10;

		}
	


		int w=15, x=85, z=25; 

		while (w<19 && z>2)
		{
			z=x/w; 
			x--;
			w++;
			System.out.println( "Lets Run " + w + " miles " );
			System.out.println( " bike " + x + " miles " );
			System.out.println( " skip  " + z + " miles " );
		}	
		
		int b = 24, c = 12; 
		while( b != c )
		{
			System.out.println("b is " + b + " and c is " + c);
			b++; 
			c +=6; 
		}
		System.out.println( " b is" + b + "  and c is " + c);

		*/
		int bank = 3000; 
		int car =4000;
		int hours = 0; 
		while( bank < car ) 
		{
			hours ++; 
			bank += 12; 


		}
		System.out.println(" You worked " + hours + " Hours to buy your car"); 
	}

}