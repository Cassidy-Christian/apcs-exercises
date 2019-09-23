import java.util.Scanner;

public class MilesPerGallon
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int initial_miles, final_miles, gallons, mpg;  
        
        System.out.println( "Miles Per Gallon Program" );
        System.out.println( "Initial miles:" );
        initial_miles = scan.nextInt();
    
        while ( initial_miles <0 )    
        {
            System.out.println( "Final miles:" );
            final_miles = scan.nextInt();

            System.out.println( "Gallons:" );
            gallons = scan.nextInt();
            mpg= (final_miles-initial_miles)/gallons; 
    
          System.out.println("Miles per Gallon: " +mpg);
          System.out.println( "" );
          System.out.println( "Initial miles:" );
          initial_miles = scan.nextInt();
        }
    
        System.out.println( "bye" );
      }
    }