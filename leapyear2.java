import java.util.Scanner;

public class leapyear
{
   
   public static void main (String[] args)
   {
      int year;
      Scanner scan = new Scanner(System.in);
      System.out.println(" Exit key is 0");
      System.out.println("Enter any year: ");
      year = scan.nextInt();

      while (year < 1582 && year != 0)
      {
         System.out.println("not a valid year");
     	 System.out.println("enter a valid year greater than 1582");
     	 year = scan.nextInt();
     	 
     	}
      while( year > 1582 && year!= 0)
      {
         if (year%4==0) // divisible by 4
         {
            System.out.println( " Your year is a leap year");
            if ((year % 100 == 0) && (year % 400 != 0))
            {
               System.out.println(" Your Year is not a leap year");
            }
         }
      }

   }
}