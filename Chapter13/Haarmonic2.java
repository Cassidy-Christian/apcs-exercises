import java.util.Scanner;

public class Haarmonic2
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String X, Y; 
        double H, Arith, valuex, valuey; 

        System.out.println("Enter X: ");
        X = scan.nextLine();

        System.out.println("Enter Y:");
        Y = scan.nextLine();
        
        valuex=Double.parseDouble(X);
        valuey=Double.parseDouble(Y);

        H = 2 / (1/valuex + 1/valuey); 

        Arith = (valuex + valuey)/2; 

        System.out.println("Harmonic mean:" + H + " Arithmetic mean" + Arith);
    }
}