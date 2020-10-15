 

import java.util.Scanner;

public class TwoPair
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter four numbers: ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
      
      //compare numbers to see if there are 2 pairs 
      if (a == b && c == d)
          System.out.println("Two pairs");
      else if (b == d && a == c)
          System.out.println("Two pairs");
      else if (a == d && b == c)
          System.out.println("Two pairs");
      else 
          System.out.println("There are not two pairs");
          
   }
}
