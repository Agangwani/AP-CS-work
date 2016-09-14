

public class starsA
{
   public static void main (String[] args)
   {
       int lim = 10;
       int star;
      for (int row = 1; row <= lim; row++)
      {
         for ( star = 1; star <= lim-row+1; star++)
            System.out.print ("*");

         System.out.println();
      }
   }
}
