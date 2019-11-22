import java.util.*;

public class MonthTester
{
  public static void main( String[] args)  
  {
    Scanner scan = new Scanner( System.in );
    Month jan = new Month( 1, 2017 ) ;
    String line = "Y";
    
    // Fill Month with temperatures
    while ( line.toUpperCase().charAt(0) == 'Y' )
    {
      System.out.print("day?  ");
      int day = scan.nextInt();
      
      System.out.print("temp ? ");
      int temp = scan.nextInt();
      if ( !jan.setTemp(day, temp ) )
        System.out.println(" error in input ");
       
      System.out.print("Continue (Y/N)? ");
      line = scan.next();
    }

    System.out.println( jan );    
  }
  
}