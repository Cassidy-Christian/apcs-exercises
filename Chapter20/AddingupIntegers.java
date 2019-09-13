import java.util.Scanner;

public class AddingupIntegers
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int number_ofintegers, entered_integer, total;  
        
        System.out.println("How many integers will be added:");
        number_ofintegers = scan.nextInt();
        
        total=0;

        while ( number_ofintegers>0 )  // there are changes here
        {
            System.out.println("Enter an integer:");
            entered_integer = scan.nextInt();
            total+=entered_integer; 
            number_ofintegers-=1;
        }

        System.out.println("The sum is  "+total);
    }
}