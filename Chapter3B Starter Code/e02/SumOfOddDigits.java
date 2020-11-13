package e02;

import java.util.Scanner;

public class SumOfOddDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // Get the input
      System.out.println("Enter numbers: ");
      int nums= in.nextInt(); 
      // The sum of odd digits of the input
      int count=0;
      while(in.hasNextInt()){
          int input=in.nextInt();
          // Only add digit if it is odd
          if (input%2!=0){
            System.out.println(input);
            count+=input;
        }
        }
      // Output the result
      System.out.println(count); 


      
   }
}
