package e03;

import java.util.Scanner;

public class NumberEvenOddInputs
{
   public static void main(String[] args)
   {
      int numOdd = 0;
      int numEven = 0;

      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");
      while (in.hasNextInt()){
          int input= in.nextInt(); 
          if(input%2==0)
            System.out.println(input+" is an even number");
          else
            System.out.println(input+" is an odd number");
          
        } 
      

   }
}
