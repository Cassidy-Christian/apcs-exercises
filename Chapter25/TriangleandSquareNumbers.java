import  java.util.Scanner;

public class TriangleandSquareNumbers
{

  public static void main( String[] args ) 
  {

    double n,i=0, triangle=0 ; 
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert number:");
    n= scan.nextDouble(); 

while (triangle!= n*n){
    if (triangle>n*n){
        n+=1;
    }
    i++; 
    triangle+=i; 
    System.out.println("Not a square and triangle number"+triangle);
}
   
    
        System.out.println("The number"+ n +"is both a square and a triangle number!"+triangle);
}
}