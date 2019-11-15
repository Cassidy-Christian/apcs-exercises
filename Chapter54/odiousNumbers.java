import java.util.*;
public class odiousNumbers
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("insert a number"); 
       int n = scan.nextInt();
        while (n<0){
            System.out.println("Thank you for trying!"); 
            break; 
        }
    while (n>0){
       System.out.println("Is it an odious number?"+isOdious(n)); 
       System.out.println("Please insert another number"); 
       n = scan.nextInt();
       if (n<0){
        System.out.println("Thank you for trying!"); 
        break; 
    }
    } 
    }

    public static  boolean isOdious(int n)

    {

        int sum=0;
        while(n>0)
        {
            if(n%2==1)
            {
                sum++;
            }
                n=n/2;
        }
        if(sum%2==1)
        {
           // "odious number"
            return true;
        }
        else
        {
          //  "evil number"
            return false;
        }
    }
}