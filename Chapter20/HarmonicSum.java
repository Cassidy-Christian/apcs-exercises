import java.util.Scanner;

public class HarmonicSum
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double n, total;  
        
        System.out.println("Enter N");
        n = scan.nextDouble();
        
        total=0;

        while ( n>0 )  // there are changes here
        {
            total+=1/n; 
            n-=1;
        }

        System.out.println("Sum is  "+total);
    }
}