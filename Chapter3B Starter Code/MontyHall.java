import java.util.Scanner; 
import java.util.Random;
/**
 * Write a description of class MontyHall here.
 *
 * @Anna Vukovch
 * @version (a version number or a date)
 */
public class MontyHall
{
    public static void main(String[] args){
        Random random = new Random();
        int choice=0, win=0,tell=0,stayWin=0,swichWin=0;
        for (int i=0; i<1000; i++){
            choice= random.nextInt(3); 
            win= random.nextInt(3);
            tell=random.nextInt(3);
            // figure out what door to show to the player- that isn't the winning door
            while(tell== choice || tell==win){
                tell=random.nextInt(3);
            }
            // count wins for staying versus swiching
            if (win==choice)
                stayWin++;
            else 
                swichWin++; 
        }
        System.out.println("If you stay, you win "+stayWin+" out of 1000");
        System.out.println("If you swich, you win "+swichWin+" out of 1000");
    }
}
