import java.util.Scanner;
public class switch_example
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            char choice; 

       // switch statement------------------------------


            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");
            
            choice= Keyboard.next().charAt(0);
            switch(choice)
            {
               case'f':
               case 'F': 
                System.out.print(.99);// level 400 internet (cascades down and prints c and s) 
                break;
               case 'c':
                System.out.print(1.50);//level 200  phone 
                break; 
               case 's':
                System.out.print(.89);// level 100  cable TV
                break; 
               default: 
                System.out.print("Error on Input"); 
                
            }


    }//endo of main

}//end of class