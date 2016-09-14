

public class StarsA
{
   public static void main (String[] args)
   {
      final int LIMIT = 10;

      for (int row = 1; row <= LIMIT; row++)
      {
         for (int star = 1; star <= LIMIT-row+1; star++)
            System.out.print ("*");

         System.out.println();
      }
   }
}
