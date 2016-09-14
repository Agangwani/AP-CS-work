import java.util.Scanner;
    
public class vowels

{


    public static void main(String args [])
        {

           int a =0, e = 0, x = 0;
           int u = 0, o = 0, other = 0;
           String text;
           Scanner scan = new Scanner(System.in);


             System.out.print("enter a string: ");
             text = scan.nextLine();

             for (int i = 0; i < text.length(); i++)
                   {
                        char c = text.charAt(i);

                      if (c=='a')
                        a++; 

                      else if( c=='e')
                         e++;

                     else if(c=='i')
                      x++;

                      else if(c=='o')
                      o++;

                      else if (c=='u')
                      u++;        
                   

                       else
                      other++;
                   }

         System.out.println(
         "a: " + a + "\t" +

          "e: " + e + "\t" +

          "i: " + x + "\t" +

          "o: " + o + "\t" +

          "u: " + u + "\t" +

          "other: " + other);

       }

}