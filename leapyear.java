import java.util.Scanner;

public class leapyear
{
   
   public static void main (String[] args)
   {
      int year;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter any year: ");
      year = scan.nextInt();
      if (year < 1582)
         System.out.println("not a valid year");
      else
      {
         if (year%4==0) // divisible by 4
         {
            System.out.println1( " Your year is a leap year");
            if ((year % 100 == 0) && (year % 400 != 0))
            {
               System.out.println(" Your Year is not a leap year");
            }
         }
      }

   }
}