import java.util.Scanner;
/**
 * Write a description of class Triangle here.
 *
 * Anna Vukovic
 * @version (a version number or a date)
 */
public class Triangle
{
    public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter S to input sides or A for angles"); 
        String answer= in.next(); 
        
        if (answer.equals("S")){
            System.out.println("Enter the 3 sides");
            int sideA= in.nextInt();
            int sideB= in.nextInt();
            int sideC= in.nextInt();
            
            //Check to see if the values make a triangle 
            if (sideA+sideB<=sideC || sideA+sideC<=sideB ||sideB+sideC<=sideA)
                System.out.println("These values don't make a triangle");
            else if (sideA==0 || sideB==0 || sideC==0)
                System.out.println("These values don't make a triangle");
            // find what kind of triangle the values make 
            //scalene, isocilese, equilateral,
            else if (sideA==sideB && sideB==sideC)
                System.out.println("The triangle is equilateral");
            else if (sideA==sideB || sideB==sideC || sideA==sideC)
                System.out.println("The triangle is isocilese"); 
            else 
                System.out.println("The triangle is scalene"); 
        }
        else if (answer.equals("A")){
            System.out.println("Enter the 3 angles");
            int angleA= in.nextInt();
            int angleB= in.nextInt();
            int angleC= in.nextInt();
            //See if the values make triangle 
            if (angleA==90 && angleB==90)
                System.out.println("These values don't make a triangle");
            else if (angleA==90 && angleC==90)
                System.out.println("These values don't make a triangle");
            else if (angleB==90 && angleC==90)
                System.out.println("These values don't make a triangle");  
            else if (angleA+angleB+angleC != 180)
                System.out.println("These values don't make a triangle");
                
            // See what kind of triangle the values make
            //Right, isocilese, equilateral, right isocilese 
            else if (angleA==angleB || angleB==angleC || angleA==angleC)
                if (angleA==90 || angleB==90 || angleC==90)
                    System.out.println("These angles make a right isocilese triangle");
                else
                    System.out.println("Thes angles make an isocilese triangle");
            else if(angleA==90 || angleB==90 || angleC==90)
                System.out.println("These angles make a right triangle");
            else 
                System.out.println("These angles make an equilateral triangle");
        }
        else
            System.out.println("Error in input");
            
        
        
    }       
}


/*
 * 
Enter the 3 angles
90 45 45
These angles make a right isocilese triangle
Enter S to input sides or A for angles
S
Enter the 3 sides
2 2 2
The triangle is equilateral
 */