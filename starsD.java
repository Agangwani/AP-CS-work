public class starsD
{
  
   public static void main (String[] args)
   {
      int limit = 10;
      int row;
      int space;
      int star;

  
      for ( row = 1; row <= limit/2; row++)
      {
         for ( space = 1; space <= (limit/2)-row; space++)
            System.out.print (" ");

         for ( star = 1; star <= (row*2)-1; star++)
            System.out.print ("*");

         System.out.println();
      }




      for ( row = 1; row <= limit/2; row++)
      {
         for ( space = 1; space <= row-1; space++)
            System.out.print (" ");

         for ( star = 1; star <= limit-(row*2)+1; star++)
            System.out.print ("*");

         System.out.println();
      }
   }
}
