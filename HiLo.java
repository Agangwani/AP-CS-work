import java.util.Scanner;
import java.util.Random; 

public class HiLo
{
  
   public static void main (String[] args)
   {
    int max = 100;
      int target;
      int  count = 0;
      int guess = 0; 
      Scanner scan = new Scanner(System.in);
      Random rn = new Random(); 

      target = rn.nextInt(100) +1; 
      System.out.println(" make a guess (-1 to quit) ");
          guess = scan.nextInt();

      while (guess != -1)
      {

          if (guess > target)
            System.out.println(" your value is too high");
         if ( guess < target) 
               System.out.println( " Your value is too low"); 
         if ( guess == target)
               System.out.println( " Your value is the target") ;

            guess = scan.nextInt();

      }
   }
}

            




      
     
