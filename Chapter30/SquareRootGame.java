import  java.util.Scanner;
import java.util.Random;

public class SquareRootGame{

public static void main( String[] args) {

    int user1total=0;
    int user2total=0; 
    String user1, user2; 
    Scanner scanner = new Scanner( System.in );
    Random random = new Random();

    System.out.print("First Player, sign in:"); 
    user1= scanner.nextLine(); 

    System.out.print("Second Player, sign in:"); 
    user2= scanner.nextLine(); 


    System.out.println("How many rounds?"); 
    int rounds= scanner.nextInt(); 



    while (rounds>0) {
        int comp1 =random.nextInt(99)+1;

        System.out.println("                                    "); 
        System.out.println("What is the square root of "+comp1); 

        System.out.println(user1+", your guess:");
        double guess1= scanner.nextDouble(); 

        System.out.println(user2+", your guess:");
        double guess2= scanner.nextDouble(); 

        double sqrtcomp=Math.sqrt(comp1); 

        double guess1dif= Math.abs(sqrtcomp-guess1); 
        double guess2dif= Math.abs(sqrtcomp-guess2); 
        System.out.println("The correct square root:"+sqrtcomp); 
        System.out.println(user1+" is "+guess1dif+" away"); 
        System.out.println(user2+" is "+guess2dif+" away");
        
        if (guess1dif<guess2dif){
            System.out.println(user1+" wins!"); 
            rounds-=1; 
           user1total+=1;
        }
        else{
            System.out.println(user2+" wins!"); 
            rounds-=1; 
           user2total+=1; 
        }

    }

    System.out.println("---- Final Score ----"); 
    System.out.println(user1+":  "+user1total); 
    System.out.println(user2+":  "+user2total);

}
}