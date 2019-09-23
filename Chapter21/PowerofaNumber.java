import  java.util.Scanner;

// User enters integer N.  
// The program calculates N factorial.
//
public class PowerofaNumber
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    double X, answer=1; 
    int N; 

    System.out.print( "Enter X: " );
    X = scan.nextDouble();

    System.out.print( "Enter N: " );
    N = scan.nextInt();

    if (N<-.01){
        System.out.print("N must be a positive integer.");
    } else {
    System.out.println( X + " raised to  " +N+" is: " + answer );
    if ( X >= 0 )
    {
      while ( N > 0 )    
      {
        answer = answer * X;
        N= N-1; 
      }
   
    }
}
}}

