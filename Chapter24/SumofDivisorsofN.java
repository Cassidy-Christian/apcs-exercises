import  java.util.Scanner;

public class SumofDivisorsofN
{

  public static void main( String[] args ) 
  {

    int n,i, sum=0 ; 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Integer N:");
    n= scan.nextInt(); 


    for (i=1; i<= n/2; i++)
    {
        if (n % i==0){
            sum = sum +i; 
        }

    }
    if (sum==n){
        System.out.println("Perfect Number!");
    }
        System.out.println("The sum of the divisors is:" + sum);
}
}