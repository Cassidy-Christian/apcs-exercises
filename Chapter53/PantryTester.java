import java.util.*;

public class PantryTester
{
  public static void main ( String[] args )
  {
          Scanner scan = new Scanner( System.in );
          String inChars;
          int answer; 
          int spread; 

    Jam jar1 = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam jar2 = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam jar3  = new Jam( "Rhubarb", "10/31/99", 3 );

    System.out.println("Welcome to Mother Hubbard's Pantry!");  
    Pantry hubbard = new Pantry( jar1, jar2, jar3 );
    System.out.println( "The jams are:"+ hubbard );

    System.out.println("Enter your selection (1, 2, or 3)"); 
     answer = scan.nextInt();
while (answer==1||answer==2||answer==3){
    hubbard.select(answer);
    System.out.println("Enter amount to spread:"); 
     spread= scan.nextInt(); 

    hubbard.spread(spread);
    System.out.println( hubbard );

        System.out.println("Enter your selection (1, 2, or 3)"); 
        answer = scan.nextInt();
}
System.out.println("Good Bye!"); 

  }
}