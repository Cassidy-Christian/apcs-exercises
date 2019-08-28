import java.util.Scanner;

public class CorrectChange
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the cents:");
        int amount= scan.nextInt();

        int dollars, quarters, dimes, nickels, cents; 

    
        dollars = amount/100;
        amount = amount % 100; 
        quarters = amount / 25;
        amount = amount % 25; 
        dimes = amount / 10; 
        amount = amount % 10; 
        nickels = amount / 5; 
        amount = amount % 5;
        cents = amount / 1; 
        amount = amount % 1; 

        System.out.println(" Your change is: " + dollars + " dollar, " + quarters +  " quarters," + dimes + " dimes, " + nickels + " nickels, " + cents + " and cents.");
    }
}