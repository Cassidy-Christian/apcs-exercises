import java.util.Scanner;

public class TownDump
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int weight ; 


        System.out.println("Weight of load:");
        weight = scan.nextInt();

        if(weight>200 )
        {
           int cost= ((weight-200)/100)*8+20;
           System.out.println("charge=$"+ cost );  
        } 
        else if (weight<200)
        {
            System.out.println("charge=$0"); 
        }
        else {
            System.out.println("charge=$20"); }
   
    }
}