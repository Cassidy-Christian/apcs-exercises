import  java.util.Scanner;

public class eX
{

  public static void main( String[] args ) 
  {

    final double smallValue = 1.0E-12 ;

    double x; 
    double sum, term, fact; 

    Scanner scan = new Scanner(System.in);
 
    System.out.println("Enter x");
    x = scan.nextDouble();
    if (x>=0){
        sum = 1 + x;  
        int i=2;
        fact=1;
       
        term = Math.pow(x,i)/i; 
        System.out.println("n:1 term:"+x+ "sum:"+x+1);
        while ( term  > smallValue )
        {
          term = Math.pow(x,i)/(i*fact); 
          sum=sum+term;
        System.out.println("n:"+i+" term:"+term+" sum"+sum);
          fact*=i;
          i++;

        }
      
        System.out.println("My e^X " + sum ) ;
        System.out.println("real e^X " + Math.exp(x) ) ;
    } else {
      System.out.println("x needs to be positive");
    }
  }
}
