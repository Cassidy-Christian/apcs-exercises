import java.util.Scanner;
import java.lang.Math; 

public class WindChillIndex
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double wind_speed, temperature, wind_chill ; 

        System.out.println("Enter Wind Speed: ");
         wind_speed = scan.nextFloat();

        System.out.println("Enter temperature:");
        temperature = scan.nextFloat();


        if(wind_speed<3  || 50<temperature)
        {
            wind_chill=temperature; 
        } 
        else {
            wind_chill= 35.74 + (0.6215*temperature)-(35.75*Math.pow(wind_speed,0.16))+(0.4275*temperature*Math.pow(wind_speed,0.16)); }


        System.out.println("Wind Chill: " + wind_chill);
    }
}