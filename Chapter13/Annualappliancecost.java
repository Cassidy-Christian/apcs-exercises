import java.util.Scanner;

public class Annualappliancecost
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double cost, hours, Annual_cost; 

        System.out.println("Enter cost per kilowatt-hour  in cents");
         cost = scan.nextInt();

        System.out.println("Enter kilowatt-hours used per year");
        hours = scan.nextInt();

        Annual_cost = cost * hours; 

        System.out.println("Annual Cost:" + Annual_cost);
    }
}