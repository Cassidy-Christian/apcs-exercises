import java.util.Scanner;

public class LogarithmBaseTwo
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double log2X, X; 

        System.out.println("Enter a double: ");
         X = scan.nextDouble();

         log2X = Math.log(X) / Math.log(2);

        System.out.println("Base 2 log is " + log2X);
    }
}