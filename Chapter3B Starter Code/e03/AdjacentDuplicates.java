package e03;

import java.util.Scanner;

public class AdjacentDuplicates
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a series of numbers (Q to stop):");
     
      int last= in.nextInt(); 
      int input; 
      while (in.hasNextInt()){
          input= in.nextInt(); 
          if (input==last)
            System.out.println(input+" and "+last+"are adjasent"); 
          last= input; 
        }
      

      // Find and print adjacent duplicates

   }
}
