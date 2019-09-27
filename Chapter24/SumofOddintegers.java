import  java.util.Scanner;

public class SumofOddintegers
{

  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);
    int n, count, sum=0; 

    System.out.println("Enter integer N:");
    n= scan.nextInt(); 

    for (count=1; count<= n;  count+=2)
    {
        sum= sum +count;
    }
    System.out.println("The sum of all odd integers from 1 to "+ n + " =" + (sum)); 
    System.out.println("N^2= "+ n*n); 
}
}