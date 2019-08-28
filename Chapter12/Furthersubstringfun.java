import java.util.Scanner;

public class Furthersubstringfun
{
    public static void main ( String[] args )
    {

        Scanner scan = new Scanner(System.in);
 

        double X, Y; 

        System.out.println("Enter a string:");
        String str = in.nextLine();

        System.out.println("Enter beginning index:");
        X = scan.nextInt();

        System.out.println("Enter ending index:");
        Y = scan.nextInt();

        String newString = originalString.substring( X, Y );

        System.out.println("Substring:" + newString);
    }
}
