import java.util.Scanner;

public class FantasyGame
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String name; 
        double strength, health, luck ; 

        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character: ");
         name = scan.nextLine();

        System.out.println("Enter strength (1-10):");
        strength = scan.nextFloat();

        System.out.println("Enter health (1-10):");
        health = scan.nextFloat();

        System.out.println("Enter luck (1-10):");
        luck = scan.nextFloat();


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