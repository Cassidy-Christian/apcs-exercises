import java.util.Scanner;

public class LastChanceGas
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double capacity, gage_reading, mpg, percent_gage ; 

        System.out.println("Tank capacity: ");
         capacity = scan.nextFloat();

        System.out.println("Gage reading: ");
        gage_reading = scan.nextFloat();

        System.out.println("Miles per Gallon:");
        mpg = scan.nextFloat();

        percent_gage = 0.01 * gage_reading; 

        if((capacity*mpg*percent_gage >=200) )
        {
            System.out.println("Safe to Proceed");
        } 
        else {
            System.out.println("Get Gas"); }
    }
}