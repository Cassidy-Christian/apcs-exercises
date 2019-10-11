import java.util.*;

public class Farkle {

public static void main( String[] args) {

    Scanner scan = new Scanner( System.in );
    Random random = new Random();
    int totaluser1=0; 
    int totaluser2=0;   
    String neededspace="";
    int roundtotal1=0; 
    int roundtotal2=0;  


    System.out.print("First Player, sign in:"); 
    String user1= scan.nextLine(); 


    System.out.print("Second Player, sign in:"); 
   String user2= scan.nextLine(); 


    System.out.println("How many total points?"); 
    int totalpoints= scan.nextInt();

    System.out.println("Roll to see who goes first");
    

    int dr1 =random.nextInt(6)+1;
    
    int dr2= random.nextInt(6)+1;

    while (dr1==dr2){
     dr1 =random.nextInt(6)+1;
     dr2 =random.nextInt(6)+1;
    }
    System.out.println("User 1 dice roll=" +dr1); 
    System.out.println("User 2 dice roll= "+dr2);
    
    if (dr1>dr2){
        System.out.println(user1+" goes first");
        System.out.println(user2+" goes second");
        String player1=user1+neededspace; 
        String player2=user2+neededspace;
    }
    
    if (dr2>dr1){
        System.out.println(user2+" goes first");
        System.out.println(user1+" goes second");
        String player1=user2+neededspace;
        String player2=user1+neededspace; 
    }

while (totaluser1<totalpoints && totaluser2<totalpoints){

        System.out.println(" Player 1 press 10 to roll");
            int answer=scan.nextInt(); 
            int workinguser1points= 0;
    while ((answer==9||answer==10|| answer==1|| answer==2 || answer==3||answer==4||answer==5||answer==6||answer==11)){
        if (answer==10||answer==11){
            int d1 =random.nextInt(6)+1; 
            int d2= random.nextInt(6)+1;
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;

            System.out.println("d1: "+d1+" d2: "+d2+" d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)|| (d1==1 && d3==1 && d6==1)||(d1==1 && d3==1 && d5==1)||(d1==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d1==2 && d2==2 && d3==2)||(d1==2 && d2==2 && d4==2)||(d1==2 && d2==2 && d5==2)||(d1==2 && d2==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)|| (d1==2 && d3==2 && d6==2)||(d1==2 && d3==2 && d5==2)||(d1==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d1==3 && d2==3 && d3==3)||(d1==3 && d2==3 && d4==3)||(d1==3 && d2==3 && d5==3)||(d1==3 && d2==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)|| (d1==3 && d3==3 && d6==3)||(d1==3 && d3==3 && d5==3)||(d1==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d1==4 && d2==4 && d3==4)||(d1==4 && d2==4 && d4==4)||(d1==4 && d2==4 && d5==4)||(d1==4 && d2==4 && d6==4)){
            workinguser1points=workinguser1points+400;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)|| (d1==4 && d3==4 && d6==4)||(d1==4 && d3==4 && d5==4)||(d1==4 && d4==4 && d6==4)){
            workinguser1points=workinguser1points+400; }
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            workinguser1points=workinguser1points+400;}
            if((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)|| (d1==5 && d3==5 && d6==5)||(d1==5 && d3==5 && d5==5)||(d1==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d1==6 && d2==6 && d3==6)||(d1==6 && d2==6 && d4==6)||(d1==6 && d2==6 && d5==6)||(d1==6 && d2==6 && d6==6)){
            workinguser1points=workinguser1points+600;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            workinguser1points=workinguser1points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)|| (d1==6 && d3==6 && d6==6)||(d1==6 && d3==6 && d5==6)||(d1==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            workinguser1points=workinguser1points+600;}

                if (d1==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d2==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if(d3==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d4==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d5==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d6==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d1==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d2==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d3==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d4==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d5==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d6==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if(d1!=1 && d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d1!=5 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle! No points for you!");
                workinguser1points=0; 
                System.out.println("Current points:" + totaluser1); 
                break; }
             System.out.println("Player 1 sum is currently:"+workinguser1points);
             System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
             answer= scan.nextInt(); 
        } 
        if (answer==5){  
            int d2= random.nextInt(6)+1;
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d2: "+d2+" d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)||(d4==3 && d5==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)){
            workinguser1points=workinguser1points+400;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            workinguser1points=workinguser1points+400;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            workinguser1points=workinguser1points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            workinguser1points=workinguser1points+600;}

                if (d2==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if(d3==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d4==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d5==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d6==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                workinguser1points=workinguser1points+100;}
                if (d2==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d3==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                workinguser1points=workinguser1points+50;}
                if (d4==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                workinguser1points=workinguser1points+50; }
                if (d5==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                workinguser1points=workinguser1points+50; }
                if (d6==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                workinguser1points=workinguser1points+50; }
                if( d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                workinguser1points=0; 
                System.out.println("Current points:" +totaluser1); 
                break;}
            System.out.println("Player1 sum is currently:"+workinguser1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==4){
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println("d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            workinguser1points=workinguser1points+400;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d4==5 && d5==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            workinguser1points=workinguser1points+600;}

                if(d3==1){
                workinguser1points=workinguser1points+100;}
                if (d4==1){
                workinguser1points=workinguser1points+100;}
                if (d5==1){
                workinguser1points=workinguser1points+100;}
                if (d6==1){
                workinguser1points=workinguser1points+100;}
                if (d3==5){
                workinguser1points=workinguser1points+50;}
                if (d4==5){
                workinguser1points=workinguser1points+50;}
                if (d5==5){
                workinguser1points=workinguser1points+50;}
                if (d6==5){
                workinguser1points=workinguser1points+50;}
                if( d3!=1 && d4!=1 && d5!=1 && d6!=1 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                workinguser1points=0; 
                System.out.println("Current points:" + totaluser1); 
                break; }
            System.out.println("Player1 sum is currently:"+workinguser1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==3){
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d4==1 && d5==1 && d6==1)){
            workinguser1points=workinguser1points+1000;}
            if((d4==2 && d5==2 && d6==2)){
            workinguser1points=workinguser1points+200;}
            if((d4==3 && d5==3 && d6==3)){
            workinguser1points=workinguser1points+300;}
            if((d4==4 && d5==4 && d6==4)){
            workinguser1points=workinguser1points+400;}
            if((d4==5 && d5==5 && d6==5)){
            workinguser1points=workinguser1points+500;}
            if((d4==6 && d5==6 && d6==6)){
            workinguser1points=workinguser1points+600;}
    
                if (d4==1){
                workinguser1points=workinguser1points+100;}
                if (d5==1){
                workinguser1points=workinguser1points+100;}
                if (d6==1){
                workinguser1points=workinguser1points+100;}
                if (d4==5){
                workinguser1points=workinguser1points+50; }
                if (d5==5){
                workinguser1points=workinguser1points+50; }
                if (d6==5){
                workinguser1points=workinguser1points+50;}
                if( d4!=1 && d5!=1 && d6!=1 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                workinguser1points=0; 
                System.out.println("Current points:" + totaluser1); 
                break; }
            System.out.println("Player1 sum is currently:"+workinguser1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==2){
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d5: "+d5+" d6: "+d6);

                if (d5==1){
                workinguser1points=workinguser1points+100;}
                if (d6==1){
                workinguser1points=workinguser1points+100;}
                if (d5==5){
                workinguser1points=workinguser1points+50;}
                if (d6==5){
                workinguser1points=workinguser1points+50;}
                if( d5!=1 && d6!=1 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!"); 
                workinguser1points=0; 
                System.out.println("Current points:" + totaluser1); 
                break;}
                if ((d5==1||d5==5)&&(d6==1||d6==5)){
                    System.out.println("Wow! Hotdice !! Enter 11 to continue rolling!"); 
                }
            System.out.println("Player1 sum is currently:"+workinguser1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==1){
                int d6= random.nextInt(6)+1;
                System.out.println(" d6: "+d6);
            
                    if (d6==1){
                    workinguser1points=workinguser1points+100;}
                    if (d6==5){
                    workinguser1points=workinguser1points+50;}
                    if(d6!=1 && d6!=5){
                    System.out.println("Farkle!  No points for you!"); 
                    workinguser1points=0; 
                    System.out.println("Current points:" + totaluser1); 
                    break;}
                System.out.println("Player1 sum is currently:"+workinguser1points);
                System.out.println("Wow!! Hot dice!! Enter 11 to continue rolling! Press 9 to stop");     
        }
        if (answer==9){
            totaluser1= totaluser1 +workinguser1points;  
            System.out.println("Your total="+totaluser1); 
            break; 
        }
    }

System.out.println("Player2, press 10 to roll the dice");
int answer2= scan.nextInt(); 
int Workinguser2points= 0;
    while ((answer2==9||answer2==10|| answer2==11||answer2==1|| answer2==2 || answer2==3||answer2==4||answer2==5||answer2==6)){
        while (answer2==10||answer2==11){
            int d1 =random.nextInt(6)+1; 
            int d2= random.nextInt(6)+1;
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            
            System.out.println("d1: "+d1+" d2: "+d2+" d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)|| (d1==1 && d3==1 && d6==1)||(d1==1 && d3==1 && d5==1)||(d1==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d1==2 && d2==2 && d3==2)||(d1==2 && d2==2 && d4==2)||(d1==2 && d2==2 && d5==2)||(d1==2 && d2==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)|| (d1==2 && d3==2 && d6==2)||(d1==2 && d3==2 && d5==2)||(d1==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d1==3 && d2==3 && d3==3)||(d1==3 && d2==3 && d4==3)||(d1==3 && d2==3 && d5==3)||(d1==3 && d2==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)|| (d1==3 && d3==3 && d6==3)||(d1==3 && d3==3 && d5==3)||(d1==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d1==4 && d2==4 && d3==4)||(d1==4 && d2==4 && d4==4)||(d1==4 && d2==4 && d5==4)||(d1==4 && d2==4 && d6==4)){
            Workinguser2points=Workinguser2points+400;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)|| (d1==4 && d3==4 && d6==4)||(d1==4 && d3==4 && d5==4)||(d1==4 && d4==4 && d6==4)){
            Workinguser2points=Workinguser2points+400; }
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            Workinguser2points=Workinguser2points+400;}
            if((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)|| (d1==5 && d3==5 && d6==5)||(d1==5 && d3==5 && d5==5)||(d1==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d1==6 && d2==6 && d3==6)||(d1==6 && d2==6 && d4==6)||(d1==6 && d2==6 && d5==6)||(d1==6 && d2==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)|| (d1==6 && d3==6 && d6==6)||(d1==6 && d3==6 && d5==6)||(d1==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}

                if (d1==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d2==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if(d3==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d4==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d5==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d6==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d1==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d2==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d3==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d4==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d5==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d6==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if(d1!=1 && d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d1!=5 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                Workinguser2points=0; 
                System.out.println("Current points:" + totaluser2); 
                break; }
             System.out.println("Player2 sum is currently:"+Workinguser2points);
             System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
             answer2= scan.nextInt(); 
        } 
        if (answer2==5){  
            int d2= random.nextInt(6)+1;
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d2: "+d2+" d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)||(d4==3 && d5==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)){
            Workinguser2points=Workinguser2points+400;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            Workinguser2points=Workinguser2points+400;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}

                if (d2==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if(d3==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d4==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d5==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d6==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                Workinguser2points=Workinguser2points+100;}
                if (d2==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d3==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                Workinguser2points=Workinguser2points+50;}
                if (d4==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                Workinguser2points=Workinguser2points+50; }
                if (d5==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                Workinguser2points=Workinguser2points+50; }
                if (d6==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                Workinguser2points=Workinguser2points+50; }
                if( d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                Workinguser2points=0; 
                System.out.println("Current points:" + totaluser2); 
                break;}
            System.out.println("Player2 sum is currently:"+Workinguser2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer2==4){
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println("d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            Workinguser2points=Workinguser2points+400;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d4==5 && d5==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}

                if(d3==1){
                Workinguser2points=Workinguser2points+100;}
                if (d4==1){
                Workinguser2points=Workinguser2points+100;}
                if (d5==1){
                Workinguser2points=Workinguser2points+100;}
                if (d6==1){
                Workinguser2points=Workinguser2points+100;}
                if (d3==5){
                Workinguser2points=Workinguser2points+50;}
                if (d4==5){
                Workinguser2points=Workinguser2points+50;}
                if (d5==5){
                Workinguser2points=Workinguser2points+50;}
                if (d6==5){
                Workinguser2points=Workinguser2points+50;}
                if( d3!=1 && d4!=1 && d5!=1 && d6!=1 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!   No points for you!");
                Workinguser2points=0; 
                System.out.println("Current points:" + totaluser2); 
                break; }
            System.out.println("Player2 sum is currently:"+Workinguser2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer2= scan.nextInt(); 
        }
        if (answer2==3){
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d4==1 && d5==1 && d6==1)){
            Workinguser2points=Workinguser2points+1000;}
            if((d4==2 && d5==2 && d6==2)){
            Workinguser2points=Workinguser2points+200;}
            if((d4==3 && d5==3 && d6==3)){
            Workinguser2points=Workinguser2points+300;}
            if((d4==4 && d5==4 && d6==4)){
            Workinguser2points=Workinguser2points+400;}
            if((d4==5 && d5==5 && d6==5)){
            Workinguser2points=Workinguser2points+500;}
            if((d4==6 && d5==6 && d6==6)){
            Workinguser2points=Workinguser2points+600;}
    
                if (d4==1){
                Workinguser2points=Workinguser2points+100;}
                if (d5==1){
                Workinguser2points=Workinguser2points+100;}
                if (d6==1){
                Workinguser2points=Workinguser2points+100;}
                if (d4==5){
                Workinguser2points=Workinguser2points+50; }
                if (d5==5){
                Workinguser2points=Workinguser2points+50; }
                if (d6==5){
                Workinguser2points=Workinguser2points+50;}
                if( d4!=1 && d5!=1 && d6!=1 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                Workinguser2points=0; 
                System.out.println("Current points:" + totaluser2); 
                break; }
            System.out.println("Player2 sum is currently:"+Workinguser2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer2= scan.nextInt(); 
        }
        if (answer2==2){
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d5: "+d5+" d6: "+d6);

                if (d5==1){
                Workinguser2points=Workinguser2points+100;}
                if (d6==1){
                Workinguser2points=Workinguser2points+100;}
                if (d5==5){
                Workinguser2points=Workinguser2points+50;}
                if (d6==5){
                Workinguser2points=Workinguser2points+50;}
                if( d5!=1 && d6!=1 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!"); 
                Workinguser2points=0; 
                System.out.println("Current points:" + totaluser2); 
                break;}
            System.out.println("Player 2 sum is currently:"+Workinguser2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer2= scan.nextInt(); 
        }
        if (answer2==1){
                int d6= random.nextInt(6)+1;
                System.out.println(" d6: "+d6);
            
                    if (d6==1){
                    Workinguser2points=Workinguser2points+100;}
                    if (d6==5){
                    Workinguser2points=Workinguser2points+50;}
                    if(d6!=1 && d6!=5){
                    System.out.println("Farkle!  No points for you!"); 
                    Workinguser2points=0; 
                    System.out.println("Current points:" + totaluser2); 
                    break;}
                System.out.println("Player2 sum is currently:"+Workinguser2points);
                System.out.println("Wow!! Hot dice!! Enter 11 to continue rolling! Press 9 to stop");     
        }
        if (answer2==9){
            totaluser2= totaluser2+Workinguser2points;  
            System.out.println("Your total="+totaluser2); 
            break; 
        }
    }
}
    

if (totaluser2>totalpoints||totaluser1>totalpoints){ 
    if (totaluser2>totaluser1){
        System.out.println("Player 2 wins! total points:" + totaluser2);
        System.out.println("Player 1 lost! Total points:" +totaluser1);}
    if (totaluser1>totaluser2){
        System.out.println("Player 1 wins! total points:" +totaluser1);
        System.out.println("Player 2 lost! total points:" + totaluser2);}
}



}
}

