    /********************************************************************
    // These are the notes for ch 3 used in hayes class
    
    
    import
    //******************************************************************* */
    
    
    import java.text.DecimalFormat;
    import java.text.NumberFormat;
    import javax.swing.*;
    import java.util.StringTokenizer;
    import java.util.Scanner;
    
    import java.io.*;       //for File IO
    // test 
    public class ch3notes
    {
        Integer one = 1;
        enum Classes  {CalculusAB, English, SpanishIII, Gym, Lunch, APCS, APush, Photo}
        enum Grades {A,B,C,D,F}
        enum Week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
    
          public static void main (String [] args) throws IOException // required for File IO
           {
               final double TOLERANCE = .001; 
               
               Scanner keyboard = new Scanner(System.in); 
               DecimalFormat fmt = new DecimalFormat ("0.###");
               Integer two = 2;
               Grades mygrade = Grades.A;
               Grades yourgrade = Grades.B;
               System.out.println(yourgrade.compareTo( mygrade) );
               String[] people = {"Deepa", "Trevor", "Murugan", "Emy",
                                  "Thomas", "Charlie",
                                  "heinz doofenshmirtz", "Michael",
                                  "NoOne", "Bueller","Justin","David"};
                                  
        
        Scanner scanFile = new Scanner(new File ("speaches/state of the union 2011.txt"));
        int count_p=0, count_y=0, count_n=0, count_words=0, count_j=0;
        while (scanFile.hasNext())
        {
            String word= scanFile.next(); 
            if (word.equals("us")||word.equals("we"))
                count_p++; 
        }
        
     // logical opporater AND &&
     //logical OR ||
                     
        /*String word = new String("cat");
            String word1= new String("apple"); 
            String word2= "cat";
            String word3= "dog";
            
            
           /* 
            System.out.println("Enter 3 numbers : ");
            int x= keyboard.nextInt();
            int y= keyboard.nextInt();
            int z= keyboard.nextInt();
        */ 
       
       /* double num1, num2, num3;
        //convrts to binary (1 and 0)
        //the result is a bit off 
        num1= 0.01*1+.05*2+.1*3+.25*4; 
        num2= 500.0/900;
        
        System.out.println("num1- "+num1);
        System.out.println("num2- "+num2);
        
        //if (num1==1.41)// error when doubles are calculated can be a bit ofr
        /*if (Math.abs(num1-1.41)<TOLERANCE) 
        {
            System.out.println("equal");
        }
        else
            System.out.println("not equal"); 
        
       /* 
  
            
        if (x>y){
            if (x>z)
                System.out.println(x+" is the largst");
            }        
        else if (y>x){
            if (y>z)
                System.out.println(y+" is the largst");
            }       
        else
            System.out.println(z+" is the largst"); 
                
            
        /*if (x<y)//; ends an if statment (the rest wouldn't run) 
            System.out.println("x<y"); 
       
        if (x>y && x>z)
            System.out.println("x is the largst");
           System.out.println("I will always exicute"); //if no brackets- only one line will run 
      // in if statments, order matters- it il like a logical OR 
           /*
        //I am in relation to the other 
        if (word.compareTo(word2)<0)
            System.out.println(word +" is before "+word2); 
        else if(word.compareTo(word2)>0)
            System.out.println(word +" is after "+word2); 
        else 
            System.out.println(word +" are the same "+word2); 
        
        
        
        
        /*    int wordCount = 0, characterCount = 0;
                     String line, word;
                     StringTokenizer tokenizer;
        
                     System.out.println ("Please enter text");
        
                     line = Keyboard.readString();
        
                        tokenizer = new StringTokenizer (line,"/");
        
        
                x = Integer.parseInt(input);
                System.out.print(x);
        
        
        
       
        
        /* WHAT WILL OUTPUT?
            int k =0, j=0;
        
            System.out.println("k \tj");
        
            for(j=0; j<20; j+=k)
            {
                k++;
                System.out.println(k + "\t" + j);
            }
        
            System.out.println("After the loop \n k= " +k +"\tj= " +j);
        
        */
       /*Scanner in = new Scanner(System.in);
       System.out.println("Enter numbers, then Q to proccess");
       int number= in.nextInt(); 
       
       while (in.hasNextInt())
       {
          int input= in.nextInt();
          System.out.println("eco-"+input); 
           
        }
        System.out.println("Loop over"); 
        /*
            Scanner scanFile = new Scanner(new File("people.txt"));
            String name, address, phone;
        
            while(scanFile.hasNext())
            {
        
            }
        
        
        
        /**/
        
        
            //Scanner scanFile = new Scanner(new File ("state of the union 2011.txt"));
        
            //Scanner scanFile = new Scanner
            //  (new File ("data\\obamatakebackamerica.txt"));
            //Scanner scanFile = new Scanner
            //(new File ("data\\Debate12016.txt"));
            //Scanner scanFile = new Scanner(new File ("jimmy carter a crisis of confidence.txt"));
        
        /*
            String word;
            int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;
        
            while ()
            {
        
        
                //count_words ++;
        
                //System.out.println(word  );
        
        
        
            }//end of while
        
        
        //_______________________basic for and scope of i________________________
        /**/
                //ini #1a but only once 
                //middle #1b the test- a boolean 
                //body #2 execute 
                //last #3 counter 
                // ini          test     inc
         /* for(int i = 0, j=20 ; i < 20 && j>5; i++, j-=2 )
            {
                System.out.print("Hi" + i +"-"+j+ "\n");
            }
        
      //System.out.print("After the Loop" + i + "\n");// will give an error
        // i is outside of the scope 
        
        
        
        //--- While loop and sentinel value
        
        /*
        
            int test;
            System.out.println("Guess my favorite number \n" +
                                    "it is between 1-20");
            test = Keyboard.nextInt();
        
            while (test != -9999 && test !=15)
            {
                if (test == 15)
                    System.out.println
                        ("it the age of my sons"+
                        " Thomas and Charlie");
                else
                    System.out.println("Guess again, or -9999 to end the program");
        
                test = Keyboard.nextInt();
        
            }
        
        
        
        int i =0;//#1
        
                 while (i<10)//#2 when the test is true
                {
                    System.out.print( "i =" + i +"\n");
                    i++;//#3
                }
        i=0;
                do
                {
                    System.out.print( "i =" + i +"\n");
                    i++;//#3 
                    
                }while(i<10);
        
        
        
        /*  */
        
       }// end of main
    
    }// end of class
    
    
    
    
    
    
    
    
    
