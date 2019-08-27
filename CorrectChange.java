import java.util.Scanner;

public class CorrectChange
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
       int dollars, cents_entered, cents_remainder, cents, quarters, nickels, dimes; 

        System.out.println("Input the cents:");
        cents_entered = scan.nextInt();

        dollars = cents_entered / 100; 
        quarters = (cents_entered / 100) %  25 ;  
        dimes = ((cents_entered - dollars)/ 25) / 10; 
        nickels = (((cents_entered - dollars)/ 25) / 10) / 5; 
        cents = ((((cents_entered - dollars)/ 25) / 10) / 5) % 100; 

        System.out.println(" Your change is: " + dollars + "dollars, " + quarters +  " quarters," + dimes + " dimes," + nickels + "nickels," + cents + "cents," );
    }
}