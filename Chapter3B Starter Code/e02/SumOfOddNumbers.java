package e02;

import java.util.Scanner;

public class SumOfOddNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      // Get the inputs
      System.out.println("Enter 2 numbers (largst to smallst): ");
      int a= in.nextInt(); 
      int b= in.nextInt();
      int count=a-b,i,sum=0; 
      // The sum of odd numbers between a and b
      while(b<a){
          if(b%2==1)
            sum+=b; 
      }
         // Only add number if it is odd

      // Output the result
      System.out.println("The sum is " + sum + ".");
   }
}
