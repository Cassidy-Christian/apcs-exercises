import java.util.Scanner;

public class AreaofaCircle
{
    public static void main ( String[] args ) 
{
        Scanner scan = new Scanner(System.in);
       double rad, area; 

        System.out.println("Input the radius:");
        rad = scan.nextInt();

        area = rad * rad * Math.PI;

        System.out.println("The radius s: " + rad + "The area is:" + area);
    }
}