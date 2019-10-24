
import  java.util.Scanner;

public class Triangle2
{

  public static void main( String[] args ) 
  {

    double n, triangle=0 ; 
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert number:");
    n= scan.nextDouble(); 
    for(int i=0; triangle!=n*n; triangle+=i++){
        if (triangle>n*n){
           n+=1;
       }
       System.out.println("Not a square and triangle number: "+triangle);
   }
   System.out.println("Is a triangle and square number at: "+triangle);
  }
}