import  java.util.Scanner;

public class BirthdayParadox
{

  public static void main( String[] args ) 
  {

    double n,i, probability=1 ; 
    Scanner scan = new Scanner(System.in);
    System.out.println("Number of guests: ");
    n= scan.nextDouble(); 


    for (i=0; i<= n; i++)
    {
        probability= probability *((365-i)/365);

    }
        System.out.println("Probability that none of the guests share a birthday:" + probability);
}
}