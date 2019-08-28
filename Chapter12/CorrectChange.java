import java.util.Scanner;

public class CorrectChange
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the cents:");
       double totalcents =  scan.nextInt();
 
        double numdollars, numquarters, numdimes, numnickels, numcents; 
        double centsleft;

        double dollars = 100; 
        double quarters = 25; 
        double dimes = 10; 
        double nickels = 5; 
        double cents = 1; 


        numdollars = totalcents/dollars; 
        centsleft = totalcents % dollars ; 
        numquarters = centsleft/quarters; 
        centsleft= centsleft/quarters; 
        numdimes= centsleft/dimes;
        centsleft= centsleft % dimes; 
        numnickels= centsleft/nickels; 
        centsleft= centsleft % nickels; 
        numcents = centsleft/cents; 
        centsleft = centsleft % cents;

        System.out.println(" Your change is: " + numdollars + " dollar, " + numquarters +  " quarters," + numdimes + " dimes, " + numnickels + " nickels, " + numcents + " and cents.");
    }
}