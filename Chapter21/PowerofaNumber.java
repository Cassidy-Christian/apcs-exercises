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

    if ( X >= 0 )
    {
      while ( N > 0 )    
      {
        answer = answer * X;
        N= N-1; 
      }
      System.out.println( X + " raised to that power is: " + answer );
    }
    else
    {
      System.out.println("N must be a positive integer.");
    }
  }
}
