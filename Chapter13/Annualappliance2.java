import java.util.Scanner;

public class Annualappliance2
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double annual_cost; 
        String cost, hours;

        System.out.println("Enter cost per kilowatt-hour  in cents");
         cost = scan.nextLine();

        System.out.println("Enter kilowatt-hours used per year");
        hours = scan.nextLine();

        annual_cost = Double.parseDouble(cost) * Double.parseDouble(hours);

        System.out.println("Annual Cost:" + annual_cost);
    }
}