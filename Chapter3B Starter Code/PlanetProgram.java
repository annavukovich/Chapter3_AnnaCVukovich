import java.util.Scanner; 
import java.text.DecimalFormat;
/**
 * Write a description of class PlanetProgram here.
 *
 * Anna Vukovich
 * @version (a version number or a date)
 */
public class PlanetProgram
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        char choice; 
        double newWeight; 
        
        System.out.println("what weight do you want to convert? ");
        int weight= in.nextInt();
        
        //Print menue 
        System.out.println("Planet:   Number: ");
        System.out.println("Mercury   1 ");
        System.out.println("Venus     2 ");
        System.out.println("Mars      3 ");
        System.out.println("Jupiter   4 ");
        System.out.println("Saturn    5 ");
        System.out.println("Uranus    6 ");
        System.out.println("Neptune   7 ");
        System.out.println("Pluto     8 ");
        System.out.println("The Moon  9 ");
        
        System.out.println("Enter a planet to convert the weight: ");
        choice= in.next().charAt(0); 
        DecimalFormat fmt2= new DecimalFormat("0.##");
        
        //calculate the new weight and out put it acording to the user's choice
        switch(choice)
        {
            case '1':
             newWeight=(weight*0.38);
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break; 
            case '2':
             newWeight=(weight*0.91);
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break;
            case '3': 
             newWeight= weight*0.38; 
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break;
            case '4':
             newWeight= weight*2.53;
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break;
            case '5':
             newWeight= weight*1.08;
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break;
            case '6':
             newWeight= weight*0.91;
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break; 
            case '7':
             newWeight= weight*1.19;
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break;
            case '8':
             newWeight= weight*06;
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break; 
            case '9':
             newWeight= weight*0.17;
             System.out.println("Your new weight is "+fmt2.format(newWeight));
             break;
        
        }
        
    }
}
