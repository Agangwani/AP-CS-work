import java.util.Scanner; 


public class Beer
{
	public static void main(String[] args)
	{
	int count = 100;
      int numverse = 0; 
      Scanner scan = new Scanner(System.in);

      while (numverse < 1 || numverse > count)
      {
         System.out.print ("How many verses do you want to print ");
         numverse = scan.nextInt();
      }
      

      for (int verse = 1; verse <= numverse; verse++)
      {
         System.out.println (count + " bottles of beer on the wall.");
         System.out.println (count + " bottles of beer.");
         System.out.println (" If one of those bottles should happen to fall ");

         count = count - 1;

         System.out.println (count + " bottles of beer on the wall.");
         System.out.println ();
      }
   }
}