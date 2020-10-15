import java.util.Scanner;

public class NumOrderCondition
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter S for strict ordering, L for lenient (S or L):");
      String answer = in.next();

      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      
      if (answer.equals("S"))
      {
      if (a>b && b>c)
        System.out.println("Decreasing");
      else if (a<b && b<c) 
        System.out.println("Increasing"); 
      else
        System.out.println("Neither"); 
    }
      else if (answer.equals("L"))
      {
        if (a==b && b==c)
            System.out.println("Niether");
        else if (a>=b && b>=c)
            System.out.println("Decreasing");
        else
            System.out.println("Increasing");
        }
   }
}
