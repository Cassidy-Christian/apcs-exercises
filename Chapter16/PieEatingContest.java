import java.util.Scanner;

public class PieEatingContest
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double weight ; 

        System.out.println("Please input your weight: ");
         weight = scan.nextFloat();



        if(220<= weight && weight<=280)
        {
            System.out.println("Pie for you!!");
        } 
        else {
            System.out.println("No pie for you :("); }
    }
}