
import java.util.Scanner;
/**
 * Write a description of class Minivan here.
 *
 * Anna Vukovich
 * @version (a version number or a date)
 */
public class Minivan
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        System.out.println("Sequence: DL DR CL MU IL IR OL OR Gear (with no spaces) "); 
        String sequence=new String(in.nextLine()); 
        boolean open=true, DashLeft=true, DashRight=true, inside=true; 
        
        if (!(sequence.substring(8).equals("P") ))
            open= false;
        else if (sequence.substring(3,4).equals("0"))
            inside= false; 
        else if (sequence.substring(1,2).equals("0")){
            DashRight= false;
        }
        else if (sequence.substring(0,1).equals("0")){
            DashLeft= false; 
        }
        
        if (open==false)
            System.out.println("Both doors stay closed");
        else if (DashRight== false && DashLeft==false)
            System.out.println("Bothe doors stay closed");
        else if (DashRight != false && DashLeft !=false)
            System.out.println("Both doors open"); 
        else if (DashRight != false)
            System.out.println("Right opens");
        else if (DashLeft != false)
            System.out.println("Left opens");
    }
}
