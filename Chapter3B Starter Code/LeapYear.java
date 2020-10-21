import java.util.Scanner; 
/**
 * Write a description of class LeapYear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeapYear
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a year: ");
        int year= in.nextInt(); 
        
        
        // determine if the year is a leap year
        if (year <= 1582){
            System.out.println("Error- leap year was not a thing then");
        }
        else 
        {
           if (year%400==0)
               System.out.println(year+" is a leap year");
           else if (year%100==0)
               System.out.println(year+" is not a leap year");
           else if (year%4==0)
               System.out.println(year+" is a leap year");
           else
               System.out.println(year+" is not a leap year");
            }
   
}
}

/*
 *
Enter a year: 1900
1900 is not a leap year
Enter a year: 1984
1984 is a leap year
Enter a year: 2000
2000 is a leap year

 */
