import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

//Anna Vukovich
public class DrawSquare_Student
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();

    // pen jumps to center of the graphics window
    //without drawing and points north
    pen.home();
    
    //draw with pen
    //pen.down(); 
    //pick up pen
    //pen.up();
    // move back home

    //turn the pen
    pen.turn(90);
    //draw with pen
    
    // square 
    pen.setColor(Color.red); 
    pen.down(); 
    pen.move(30); 
    pen.turn(90);
    pen.setColor(Color.blue); 
    pen.move(30);
    pen.turn(90);
    pen.setColor(Color.red); 
    pen.move(30); 
    pen.turn(90);
    pen.setColor(Color.blue); 
    pen.move(30);
     
    // Triangle 
    pen.up();
    pen.move(0);
    pen.down();
    pen.setColor(Color.yellow);
    pen.move(30);
    pen.turn(120);
    pen.setColor(Color.blue);
    pen.move(30);
    pen.turn(120);
    pen.setColor(Color.red);
    pen.move(30);
    pen.turn(120);
    
     
    
    /*
     * pen.down();
    pen.setColor(Color.blue);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
    pen.move(100);
    pen.turn(180);
    pen.move(50);
    pen.turn(30);
     */
    
}
}