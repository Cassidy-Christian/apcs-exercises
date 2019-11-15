import  java.util.Scanner;

public class FactorialwithErrorFlag
{
  
  public static long factorial( int N )
  {
    long fct = 1;
    for ( int j=1; j<=N; j++ )
      fct *= j;
    return fct;
  }
  
  public static void main (String[] args ) 
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("PLease insert an integer to find its factorial"); 
      int N = scan.nextInt();

      if ((N<0)||(N>20)){
          System.out.println("Answer:"+-1+ " Error: Does not fit in our parameters!"); 
         
      }
     else{ 
     System.out.println( "factorial of " + N + ": " + factorial( N ) );}
  }
}