import  java.util.Scanner;
import java.util.Random; 

// User enters integer N.  
// The program calculates N factorial.
//
public class MultiplicationQuiz
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    Random random = new Random();
    int answer, runs=10,num_correct=0; 
    int num1 =random.nextInt(10)+1; 
    int num2= random.nextInt(10)+1; 

    while ( runs > 0 )    
    {
        num1 =random.nextInt(10)+1; 
        num2= random.nextInt(10)+1; 
        System.out.print( "What is "+num1+"*"+num2+"?" );
        answer = scan.nextInt();
        runs -=1;
        if (answer==num1*num2){
            System.out.print("Right!");
            num_correct+=1;
            //count up
        }
        else{
            System.out.print("Wrong!");
        }
    }
    System.out.println("you got "+num_correct+ "out of ten correct");
}
}

