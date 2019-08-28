import java.util.Scanner;

public class HarmonicMean
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        float H, X, Y, Arith; 

        System.out.println("Enter X: ");
         X = scan.nextInt();

        System.out.println("Enter Y:");
        Y = scan.nextInt();

        H = 2 / (1/X + 1/Y); 

        Arith = (X + Y)/2; 

        System.out.println("Harmonic mean:" + H + " Arithmetic mean" + Arith);
    }
}