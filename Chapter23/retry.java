import java.util.Scanner;

public class retry
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

            double x=2, sum=1; 
            double term;
            double n=1;  
            double actual, small_number= 1.0E-12; 
        
            System.out.println( "Enter x:" );
            x = scan.nextInt();

         actual = Math.exp(x); 

            term= (Math.pow(x,n))/n;

            while ( term>small_number )    
           {
            term= (Math.pow(x,n))/n;
            n+=1; 
            sum= sum +term; 
          }
    
        System.out.println( "ex"+sum );
        System.out.println( "ex"+actual );
      }
    }