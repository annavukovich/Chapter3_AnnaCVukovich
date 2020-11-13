package e02;

public class SumSquares
{
   public static void main(String[] args)
   {
      int sum = 0;
      for (int i = 0; i<=100 ; i++){
          System.out.println(i+"^2="+Math.pow(i,2));
          sum+=Math.pow(i,2);
        }

      // Output the result
      System.out.println("The sum is " + sum);
   }
}
