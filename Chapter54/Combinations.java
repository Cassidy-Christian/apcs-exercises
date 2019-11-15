import  java.util.Scanner;

public class Combinations
{
  
  public static long factorialN( int N )
  {
    long fctn = 1;
    for ( int j=1; j<=N; j++ )
      fctn *= j;
    return fctn;
  }

  public static long factorialR( int R )
  {
    long fctr = 1;
    for ( int j=1; j<=R; j++ )
      fctr *= j;
    return fctr;
  }

  public static long factorialNR( int R, int N )
  {
      int NR= N-R; 
    long fctNR = 1;
    for ( int j=1; j<=NR; j++ )
      fctNR *= j;
    return fctNR;
  }


  public static void main (String[] args ) 
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("PLease insert an integer for N"); 
      int N = scan.nextInt();

      System.out.println("PLease insert an integer for R"); 
      int R = scan.nextInt();
     

      if ((N<0)||(N>20)){
          System.out.println("Answer:"+-1+ " Error: Does not fit in our parameters!"); 
         
      }
     else{ 
     System.out.println( "factorial of N: " + N + ": " + factorialN( N ) );
     System.out.println( "factorial of R: " + R + ": " + factorialR( R ) );
     System.out.println( "Number of combinations: "+(factorialN( N ))/ ((factorialR( R ))*(factorialNR(N,R))));}
  }
}