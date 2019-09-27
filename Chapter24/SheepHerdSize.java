import  java.util.Scanner;

public class SheepHerdSize
{

  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);
    double n=0, t ; 


    for (t=0; t<= 25;  t+=1)
    {

         n=220/(1+(10*Math.pow(.83, t)));
         System.out.println("Number of sheep= "+n+" After years= "+t);
    
    }
}
}