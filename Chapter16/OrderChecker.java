import java.util.Scanner;

public class OrderChecker
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double bolts, nuts, washers, cost_bolts, cost_nuts, cost_washers, total_cost ; 

        System.out.println("Number of Bolts: ");
         bolts = scan.nextFloat();

        System.out.println("Number of nuts:");
        nuts = scan.nextFloat();

        System.out.println("Number of washers:");
        washers = scan.nextFloat();


        if(nuts > bolts  && (2 * bolts) == washers )
        {
            System.out.println("Order is OK");
        } 
        else {
            System.out.println("Check the Order"); }

        cost_bolts = bolts *5; 
        cost_nuts = nuts * 3; 
        cost_washers = washers * 1; 

        total_cost = cost_bolts + cost_nuts + cost_washers; 

        System.out.println("Total cost: " + total_cost + " cents");
    }
}