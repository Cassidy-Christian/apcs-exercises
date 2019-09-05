import java.util.Scanner;

public class DiscountPrices
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double cost1, discount; 

        System.out.println("Enter amount of purchases:");
         cost1 = scan.nextDouble();

        discount = cost1 * .90;

        System.out.println("Discounted Price: " + discount);
    }
}