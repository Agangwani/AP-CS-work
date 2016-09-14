public class starsB
{
   
   public static void main (String[] args)
   {
       int limit = 10;
       int row; 
       int space;
       int star; 

      for ( row = 1; row <= limit; row++)
      {
         for ( space = 1; space <= limit-row; space++)
            System.out.print (" ");

         for ( star = 1; star <= row; star++)
            System.out.print ("*");

         System.out.println();
      }
   }
}