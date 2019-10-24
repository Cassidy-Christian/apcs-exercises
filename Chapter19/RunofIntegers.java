import java.util.Scanner;

public class RunofIntegers
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

int count, limit;  

System.out.println("Enter start:");
count = scan.nextInt();

System.out.println("Enter end:");
limit = scan.nextInt();

while ( count <= limit )  // there are changes here

{
  System.out.println( count );
  count = count + 1;   
}
}
}