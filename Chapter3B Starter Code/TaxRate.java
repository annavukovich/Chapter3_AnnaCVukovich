import java.util.Scanner; 
import java.text.DecimalFormat; 
/**
 * Write a description of class TaxRate here.
 *
 * Anna Vukovich
 * @version (a version number or a date)
 */
public class TaxRate
{
   public static void main(String[] args){
       Scanner in =new Scanner(System.in); 
       double income, tax;
      
       System.out.println("What was you income this year? ");
       income= in.nextDouble(); 
       
       if (income<=50000){
           tax= income*0.01; 
           System.out.println("Income of "+income+" , Tax of"+tax);
           System.out.println("Expected: "+tax); 
        }
       else if (income<=75000){
           tax= ((income-50000)*0.02)+(0.01*50000);
           System.out.println("Income of "+income+" , Tax of"+tax);
           System.out.println("Expected: "+tax); 
        }
       else if (income<=100000){
           tax= ((income-75000)*0.03)+(0.01*50000)+(25000*0.02);
           System.out.println("Income of "+income+" , Tax of"+tax);
           System.out.println("Expected: "+tax); 
        }
       else if (income<=250000){
           tax= ((income-100000)*0.04)+(0.01*50000)+(25000*0.02)+(150000*0.03);
           System.out.println("Income of "+income+" , Tax of"+tax);
           System.out.println("Expected: "+tax); 
        }
       else if (income<=500000){
          tax= ((income-250000)*0.05)+(0.01*50000)+(25000*0.02)+(150000*0.03)+(250000*0.04);
          System.out.println("Income of "+income+" , Tax of"+tax);
          System.out.println("Expected: "+tax); 
        }
        else if (income>500000){
        tax= ((income-5000000)*0.06)+(0.01*50000)+(25000*0.02)+(150000*0.03)+(250000*0.04)+(250000*0.05);
        System.out.println("Income of "+income+" , Tax of"+tax);
        System.out.println("Expected: "+tax); 
        }
   }
}
