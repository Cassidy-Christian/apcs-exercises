import java.util.*; 

public class GuessingGame{

public static void main( String[] args) {

    Scanner scan = new Scanner( System.in );
    Random random = new Random();

    int runs=3, answer; 
    int num1 =random.nextInt(10)+1; 

    while ( runs > 0 )    
    { 
        System.out.print( "I am thinking of a number from 1 to 10. You must guess what it is in three tries. Enter a guess:" );
        answer = scan.nextInt();
        runs -=1;

        if (answer!=num1){
            System.out.print("wrong! ");
        }
        if (answer==num1){
            System.out.println("RIGHT!");
            System.out.println("You have won the game.");
        }
    }
  
    System.out.println("The correct number was "+num1+". You have lost the game.");
}

}

