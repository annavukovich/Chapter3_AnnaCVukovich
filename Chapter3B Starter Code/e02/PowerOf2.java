package e02;

public class PowerOf2
{
   public static void main(String[] args)
   {
      // The powers of 2 from 2^0 to 2^20
      int sum = 0;
      int count=0; 
      for (int i = 0; i<60 ; i++){
          System.out.println("2^"+i+"="+Math.pow(2,i));
        }
      while(count<=20){
          System.out.println("2^"+count+"="+Math.pow(2,count));
          count+=1;
   }
}
}
