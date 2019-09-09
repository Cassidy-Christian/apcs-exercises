import java.util.Scanner;

public class Furthersubstringfun
{
    public static void main ( String[] args )
    {

        Scanner scan = new Scanner(System.in);
 
String str, substring, begin, end; 

        System.out.print("Enter a string:");
        str = scan.nextLine();

        System.out.print("Enter beginning index:");
        begin = scan.nextLine();

        System.out.print("Enter ending index:");
        end = scan.nextLine();

        substring = str.substring (Integer.valueOf(begin), Integer.valueOf(end));

        System.out.println("Original string:" + str);
        System.out.println("New string:" + substring);
    }
}
