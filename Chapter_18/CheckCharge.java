import java.util.Scanner;

public class CheckCharge
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int checking_account, savings_account ; 
        double checks, charge; 

        System.out.println("How many checks are you writing?");
        checks = scan.nextDouble();

        System.out.println("How much money do you have in your checking account?");
        checking_account = scan.nextInt();

        System.out.println("How much money do you have in your savings account?");
        savings_account = scan.nextInt();

        if(checking_account>1000 || savings_account>1500 )
        {
           System.out.println("No service charge!");  
        } 
        else {
            charge= checks*.15; 
            System.out.println("service charge="+charge); }
   
    }
}