import java.util.Scanner;

public class SumofSequentialIntegers
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int n, formula_sum, total;  
        
        System.out.println("Enter N:");
        n = scan.nextInt();
        
                formula_sum = (n*(n+1))/2;
                total=0;
        
        while ( n>0 )  // there are changes here
        {
          total+=n;  
          n-=1;
        }

        System.out.println("Loop Sum: "+total);
        System.out.println("Formula Sum: "+formula_sum);
    }
}