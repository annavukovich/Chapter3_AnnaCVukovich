package e03;

import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers,then type Q to process: ");
      int input= in.nextInt();
      int largest  = input;
      int smallest = input;
      int last= input; 
      // Loop on input and check for a new min or max
      while(in.hasNextInt()){
           input=in.nextInt(); 
           if (input<= last)
                smallest= input; 
           if (input>=last)
                largest= input; 
           last= input;
        }
      // Output the results
      System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest);
   }
}
