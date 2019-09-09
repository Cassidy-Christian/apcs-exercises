import java.util.Scanner;

public class YourAgeinSeconds
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double years, months, days, month_days, year_seconds, month_seconds, day_seconds, total_seconds ; 
    

        System.out.println("How many years have you been alive? ");
         years = scan.nextDouble();

        System.out.println("How many months have you been alive?");
        months = scan.nextDouble();

   System.out.println("How many days have you been alive?");
        days = scan.nextDouble();


        if(months==1 )
        {
            month_days=31;
        } 
        else if (months==2)
        {
            month_days=31+28;
        }
        else if (months==3){
            month_days=31+28+31;
        }
        else if(months==4){
            month_days=31+28+31+30;
        }
        else if(months==5){
            month_days=31+28+31+30+31;
        }
        else if(months==6){
            month_days=31+28+31+30+31+30; 
        }
        else if(months==7){
            month_days=31+28+31+30+31+30+31;
        }
        else if(months==8){
            month_days=31+28+31+30+31+30+31+31;
        }
        else if(months==9){
            month_days=31+28+31+30+31+30+31+31+30;
        }
        else if(months==10){
            month_days=31+28+31+30+31+30+31+31+30+31;
        }
        else if(months==11){
            month_days=31+28+31+30+31+30+31+31+30+31+30;
        }
        else {
            month_days=31+28+31+30+31+30+31+31+30+31+30+31; }

            year_seconds= years*365*24*60*60; 
            month_seconds= month_days*24*60*60; 
            day_seconds= days*24*60*60;

            total_seconds= year_seconds + month_seconds + day_seconds; 


        System.out.println("You have been alive for " + total_seconds + " seconds");
    }
}