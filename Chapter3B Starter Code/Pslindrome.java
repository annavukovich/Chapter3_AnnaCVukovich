import java.util.Scanner; 
/**
 * Write a description of class Pslindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pslindrome
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter something to test if it is a palindrom: "); 
        String input= new String(in.nextLine()); 
        
        input= new String(input.toLowerCase()); 
        input= input.replaceAll(" ","");
        boolean palindrome= true; 
        int count=1; 
        int inputlen= input.length(); 
        int middle=0,even=0; 
        
        if (inputlen%2==1){
            int odd= (inputlen-1)/2; 
            middle= odd+1; 
            even= 1; 
        }
        
        while ((count<=(inputlen-even)/2)|| (palindrome= true)){
            if (inputlen%2==0){
               if(input.charAt(count)==(input.charAt(inputlen-count)))
                    palindrome= true;
               else
                palindrome= false; 
            count++; 
        }
            else{
                
            }
                
        }
        if (palindrome==true)
            System.out.println(input+" is a palindrome."); 
        else
            System.out.println(input+" is not a palindrome.");
    }
}
