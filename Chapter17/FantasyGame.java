import java.util.Scanner;

public class FantasyGame
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String name; 
        double strength, health, luck ; 

        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character: ");
         name = scan.nextLine();

        System.out.println("Enter strength (1-10):");
        strength = scan.nextFloat();

        System.out.println("Enter health (1-10):");
        health = scan.nextFloat();

        System.out.println("Enter luck (1-10):");
        luck = scan.nextFloat();


        if(strength+health+luck>15 )
        {
            System.out.println("You have given your character too many points! Default values have been assigned:"+ name +", strength: 5, health: 5, luck: 5");
        } 
        else {
            System.out.println("Your charcter is beautiful!"); }

    }
}