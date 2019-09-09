import java.util.Scanner;

public class Distanceabricktravels
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double time, distance; 

        System.out.println("Enter the number of seconds:");
         time = scan.nextDouble();

        double g = 32.174; 

        distance = (.5) * g * (time * time);

        System.out.println("distance: " + distance);
    }
}