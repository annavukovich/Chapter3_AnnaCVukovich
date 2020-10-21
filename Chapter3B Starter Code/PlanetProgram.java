import java.util.Scanner; 

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
        System.out.println("Earth     3 ");
        System.out.println("Mars      4 ");
        System.out.println("Jupiter   5 ");
        System.out.println("Saturn    6 ");
        System.out.println("Uranus    7 ");
        System.out.println("Neptune   8 ");
        System.out.println("Pluto     9 ");
        System.out.println("The Moon  10 ");
        
        System.out.println("Enter a planet to convert the weight: ");
        choice= in.next().charAt(0); 
        
        
        switch(choice)
        {
            case '1':
             newWeight=(weight*0.38); 
             break; 
            case '2':
             newWeight=(weight*0.9042);
             break;
            case '3':
             newWeight= weight;
             break;
            case '4': 
             newWeight= weight*0.38; 
             break;
            case '5':
             newWeight= weight*2.53;
             break;
            case '6':
             newWeight= weight*1.06;
             break;
            case '7':
             newWeight= weight*0.89;
             break; 
            case '8':
             
                
        
        }
    }
}
