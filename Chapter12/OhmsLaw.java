import java.util.Scanner;

public class OhmsLaw
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        float voltage, resistance, current; 

        System.out.println("Input the voltage:");
         voltage = scan.nextInt();

        System.out.println("Input the resistance:");
        resistance = scan.nextInt();

        current = voltage/ resistance; 

        System.out.println(current);
    }
}