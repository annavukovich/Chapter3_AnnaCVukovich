import java.util.Scanner;

// Anna Vukovich
public class NumCompare
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("What is the volume?");
      double volume = in.nextDouble(); 
      System.out.println("What is the mass?");
      double mass = in.nextDouble(); 
      
      double density = mass/volume; 
      
      if (density<1)
        System.out.println("It will flaot");
      else
        System.out.println("It will sink"); 

   }
}
