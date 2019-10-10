import java.util.*;

public class Farkle {

public static void main( String[] args) {

    Scanner scan = new Scanner( System.in );
    Random random = new Random();

    int user1points= 0; 
    int user2points=0; 

    System.out.print("First Player, sign in:"); 
    String user1= scan.nextLine(); 

    System.out.print("Second Player, sign in:"); 
   String user2= scan.nextLine(); 


    System.out.println("How many total points?"); 
    int totalpoints= scan.nextInt();

while (user1points<totalpoints && user2points<totalpoints){

        System.out.println("Player one, press 10 to roll");
            int answer=scan.nextInt(); 

    while ((answer==10|| answer==1|| answer==2 || answer==3||answer==4||answer==5||answer==6||answer==11)){
        if (answer==10||answer==11){
            int d1 =random.nextInt(6)+1; 
            int d2= random.nextInt(6)+1;
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;

            System.out.println("d1: "+d1+" d2: "+d2+" d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)){
            user1points=user1points+1000;}
            if((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)){
            user1points=user1points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)|| (d1==1 && d3==1 && d6==1)||(d1==1 && d3==1 && d5==1)||(d1==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            user1points=user1points+1000;}
            if((d1==2 && d2==2 && d3==2)||(d1==2 && d2==2 && d4==2)||(d1==2 && d2==2 && d5==2)||(d1==2 && d2==2 && d6==2)){
            user1points=user1points+200;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            user1points=user1points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)|| (d1==2 && d3==2 && d6==2)||(d1==2 && d3==2 && d5==2)||(d1==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            user1points=user1points+200;}
            if((d1==3 && d2==3 && d3==3)||(d1==3 && d2==3 && d4==3)||(d1==3 && d2==3 && d5==3)||(d1==3 && d2==3 && d6==3)){
            user1points=user1points+300;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            user1points=user1points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)|| (d1==3 && d3==3 && d6==3)||(d1==3 && d3==3 && d5==3)||(d1==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            user1points=user1points+300;}
            if((d1==4 && d2==4 && d3==4)||(d1==4 && d2==4 && d4==4)||(d1==4 && d2==4 && d5==4)||(d1==4 && d2==4 && d6==4)){
            user1points=user1points+400;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)|| (d1==4 && d3==4 && d6==4)||(d1==4 && d3==4 && d5==4)||(d1==4 && d4==4 && d6==4)){
            user1points=user1points+400; }
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            user1points=user1points+400;}
            if((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)){
            user1points=user1points+500;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            user1points=user1points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)|| (d1==5 && d3==5 && d6==5)||(d1==5 && d3==5 && d5==5)||(d1==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            user1points=user1points+500;}
            if((d1==6 && d2==6 && d3==6)||(d1==6 && d2==6 && d4==6)||(d1==6 && d2==6 && d5==6)||(d1==6 && d2==6 && d6==6)){
            user1points=user1points+600;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            user1points=user1points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)|| (d1==6 && d3==6 && d6==6)||(d1==6 && d3==6 && d5==6)||(d1==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            user1points=user1points+600;}

                if (d1==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user1points=user1points+100;}
                if (d2==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user1points=user1points+100;}
                if(d3==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user1points=user1points+100;}
                if (d4==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user1points=user1points+100;}
                if (d5==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user1points=user1points+100;}
                if (d6==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user1points=user1points+100;}
                if (d1==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if (d2==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if (d3==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if (d4==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if (d5==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if (d6==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if(d1!=1 && d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d1!=5 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle! No points for you!");
                user1points=0; 
                System.out.println("Current points:" + user1points); 
                break; }
             System.out.println("Player1 sum is currently:"+user1points);
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
            user1points=user1points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            user1points=user1points+1000;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            user1points=user1points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            user1points=user1points+200;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            user1points=user1points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)||(d4==3 && d5==3 && d6==3)){
            user1points=user1points+300;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)){
            user1points=user1points+400;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            user1points=user1points+400;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            user1points=user1points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            user1points=user1points+500;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            user1points=user1points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            user1points=user1points+600;}

                if (d2==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user1points=user1points+100;}
                if(d3==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user1points=user1points+100;}
                if (d4==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user1points=user1points+100;}
                if (d5==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user1points=user1points+100;}
                if (d6==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user1points=user1points+100;}
                if (d2==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user1points=user1points+50;}
                if (d3==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user1points=user1points+50;}
                if (d4==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user1points=user1points+50; }
                if (d5==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user1points=user1points+50; }
                if (d6==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user1points=user1points+50; }
                if( d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                user1points=0; 
                System.out.println("Current points:" + user1points); 
                break;}
            System.out.println("Player1 sum is currently:"+user1points);
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
            user1points=user1points+1000;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            user1points=user1points+200;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            user1points=user1points+300;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            user1points=user1points+400;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d4==5 && d5==5 && d6==5)){
            user1points=user1points+500;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            user1points=user1points+600;}

                if(d3==1){
                user1points=user1points+100;}
                if (d4==1){
                user1points=user1points+100;}
                if (d5==1){
                user1points=user1points+100;}
                if (d6==1){
                user1points=user1points+100;}
                if (d3==5){
                user1points=user1points+50;}
                if (d4==5){
                user1points=user1points+50;}
                if (d5==5){
                user1points=user1points+50;}
                if (d6==5){
                user1points=user1points+50;}
                if( d3!=1 && d4!=1 && d5!=1 && d6!=1 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                user1points=0; 
                System.out.println("Current points:" + user1points); 
                break; }
            System.out.println("Player1 sum is currently:"+user1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==3){
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d4==1 && d5==1 && d6==1)){
            user1points=user1points+1000;}
            if((d4==2 && d5==2 && d6==2)){
            user1points=user1points+200;}
            if((d4==3 && d5==3 && d6==3)){
            user1points=user1points+300;}
            if((d4==4 && d5==4 && d6==4)){
            user1points=user1points+400;}
            if((d4==5 && d5==5 && d6==5)){
            user1points=user1points+500;}
            if((d4==6 && d5==6 && d6==6)){
            user1points=user1points+600;}
    
                if (d4==1){
                user1points=user1points+100;}
                if (d5==1){
                user1points=user1points+100;}
                if (d6==1){
                user1points=user1points+100;}
                if (d4==5){
                user1points=user1points+50; }
                if (d5==5){
                user1points=user1points+50; }
                if (d6==5){
                user1points=user1points+50;}
                if( d4!=1 && d5!=1 && d6!=1 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                user1points=0; 
                System.out.println("Current points:" + user1points); 
                break; }
            System.out.println("Player1 sum is currently:"+user1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==2){
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d5: "+d5+" d6: "+d6);

                if (d5==1){
                user1points=user1points+100;}
                if (d6==1){
                user1points=user1points+100;}
                if (d5==5){
                user1points=user1points+50;}
                if (d6==5){
                user1points=user1points+50;}
                if( d5!=1 && d6!=1 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!"); 
                user1points=0; 
                System.out.println("Current points:" + user1points); 
                break;}
            System.out.println("Player1 sum is currently:"+user1points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer= scan.nextInt(); 
        }
        if (answer==1){
                int d6= random.nextInt(6)+1;
                System.out.println(" d6: "+d6);
            
                    if (d6==1){
                    user1points=user1points+100;}
                    if (d6==5){
                    user1points=user1points+50;}
                    if(d6!=1 && d6!=5){
                    System.out.println("Farkle!  No points for you!"); 
                    user1points=0; 
                    System.out.println("Current points:" + user1points); 
                    break;}
                System.out.println("Player1 sum is currently:"+user1points);
                System.out.println("Wow!! Hot dice!! Enter 11 to continue rolling! Press 9 to stop");     
        }
    }

System.out.println("Player2, press 10 to roll the dice");
int answer2= scan.nextInt(); 

    while ((answer2==10|| answer2==11||answer2==1|| answer2==2 || answer2==3||answer2==4||answer2==5||answer2==6)){
        if (answer2==10||answer2==11){
            int d1 =random.nextInt(6)+1; 
            int d2= random.nextInt(6)+1;
            int d3= random.nextInt(6)+1;
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;

            System.out.println("d1: "+d1+" d2: "+d2+" d3: "+d3+" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)){
            user2points=user2points+1000;}
            if((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)){
            user2points=user2points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)|| (d1==1 && d3==1 && d6==1)||(d1==1 && d3==1 && d5==1)||(d1==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            user2points=user2points+1000;}
            if((d1==2 && d2==2 && d3==2)||(d1==2 && d2==2 && d4==2)||(d1==2 && d2==2 && d5==2)||(d1==2 && d2==2 && d6==2)){
            user2points=user2points+200;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            user2points=user2points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)|| (d1==2 && d3==2 && d6==2)||(d1==2 && d3==2 && d5==2)||(d1==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            user2points=user2points+200;}
            if((d1==3 && d2==3 && d3==3)||(d1==3 && d2==3 && d4==3)||(d1==3 && d2==3 && d5==3)||(d1==3 && d2==3 && d6==3)){
            user2points=user2points+300;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            user2points=user2points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)|| (d1==3 && d3==3 && d6==3)||(d1==3 && d3==3 && d5==3)||(d1==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            user2points=user2points+300;}
            if((d1==4 && d2==4 && d3==4)||(d1==4 && d2==4 && d4==4)||(d1==4 && d2==4 && d5==4)||(d1==4 && d2==4 && d6==4)){
            user2points=user2points+400;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)|| (d1==4 && d3==4 && d6==4)||(d1==4 && d3==4 && d5==4)||(d1==4 && d4==4 && d6==4)){
            user2points=user2points+400; }
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            user2points=user2points+400;}
            if((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)){
            user2points=user2points+500;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            user2points=user2points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)|| (d1==5 && d3==5 && d6==5)||(d1==5 && d3==5 && d5==5)||(d1==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            user2points=user2points+500;}
            if((d1==6 && d2==6 && d3==6)||(d1==6 && d2==6 && d4==6)||(d1==6 && d2==6 && d5==6)||(d1==6 && d2==6 && d6==6)){
            user2points=user2points+600;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            user2points=user2points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)|| (d1==6 && d3==6 && d6==6)||(d1==6 && d3==6 && d5==6)||(d1==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            user2points=user2points+600;}

                if (d1==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user2points=user2points+100;}
                if (d2==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user2points=user2points+100;}
                if(d3==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user2points=user2points+100;}
                if (d4==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user2points=user2points+100;}
                if (d5==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user2points=user2points+100;}
                if (d6==1 && !((d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1)||(d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1)|| (d1==1 && d2==1 && d3==1)||(d1==1 && d2==1 && d4==1)||(d1==1 && d2==1 && d5==1)||(d1==1 && d2==1 && d6==1))){
                user2points=user2points+100;}
                if (d1==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user2points=user2points+50;}
                if (d2==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user2points=user2points+50;}
                if (d3==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user2points=user2points+50;}
                if (d4==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user1points=user1points+50;}
                if (d5==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user2points=user2points+50;}
                if (d6==5 && !((d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==5 && d2==5 && d6==5)||(d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)|| (d1==5 && d2==5 && d3==5)||(d1==5 && d2==5 && d4==5)||(d1==5 && d2==5 && d5==5)||(d1==2 && d2==5 && d6==5))){
                user2points=user2points+50;}
                if(d1!=1 && d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d1!=5 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                user2points=0; 
                System.out.println("Current points:" + user2points); 
                break; }
             System.out.println("Player2 sum is currently:"+user2points);
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
            user2points=user2points+1000;}
            if((d3==1 && d4==1 && d5==1)||(d3==1 && d4==1 && d6==1)||(d2==1 && d4==1 && d6==1)||(d4==1 && d5==1 && d6==1)){
            user2points=user2points+1000;}
            if((d2==2 && d3==2 && d4==2)||(d2==2 && d3==2 && d5==2)||(d2==2 && d3==2 && d6==2)){
            user2points=user2points+200;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d2==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            user2points=user2points+200;}
            if((d2==3 && d3==3 && d4==3)||(d2==3 && d3==3 && d5==3)||(d2==3 && d3==3 && d6==3)){
            user2points=user2points+300;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d2==5 && d4==5 && d6==5)||(d4==3 && d5==3 && d6==3)){
            user2points=user2points+300;}
            if((d2==4 && d3==4 && d4==4)||(d2==4 && d3==4 && d5==4)||(d2==4 && d3==4 && d6==4)||(d2==4 && d4==4 && d6==4)){
            user2points=user2points+400;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            user2points=user2points+400;}
            if((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5)){
            user2points=user2points+500;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d2==5 && d4==5 && d6==5)||(d4==5 && d5==5 && d6==5)){
            user2points=user2points+500;}
            if((d2==6 && d3==6 && d4==6)||(d2==6 && d3==6 && d5==6)||(d2==6 && d3==6 && d6==6)){
            user2points=user2points+600;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d2==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            user2points=user2points+600;}

                if (d2==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user2points=user2points+100;}
                if(d3==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user2points=user2points+100;}
                if (d4==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user2points=user2points+100;}
                if (d5==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user2points=user2points+100;}
                if (d6==1 && !((d2==1 && d3==1 && d4==1)||(d2==1 && d3==1 && d5==1)||(d2==1 && d3==1 && d6==1))){
                user2points=user2points+100;}
                if (d2==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user2points=user2points+50;}
                if (d3==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user2points=user2points+50;}
                if (d4==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user2points=user2points+50; }
                if (d5==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user2points=user2points+50; }
                if (d6==5 && !((d2==5 && d3==5 && d4==5)||(d2==5 && d3==5 && d5==5)||(d2==5 && d3==5 && d6==5))){
                user2points=user2points+50; }
                if( d2!=1 && d3!=1 && d4!=1 && d5!=1 && d6!=1 && d2!=5 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                user2points=0; 
                System.out.println("Current points:" + user2points); 
                break;}
            System.out.println("Player2 sum is currently:"+user2points);
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
            user2points=user2points+1000;}
            if((d3==2 && d4==2 && d5==2)||(d3==2 && d4==2 && d6==2)||(d4==2 && d5==2 && d6==2)){
            user2points=user2points+200;}
            if((d3==3 && d4==3 && d5==3)||(d3==3 && d4==3 && d6==3)||(d4==3 && d5==3 && d6==3)){
            user2points=user2points+300;}
            if((d3==4 && d4==4 && d5==4)||(d3==4 && d4==4 && d6==4)||(d4==4 && d5==4 && d6==4)){
            user2points=user2points+400;}
            if((d3==5 && d4==5 && d5==5)||(d3==2 && d4==2 && d6==5)||(d4==5 && d5==5 && d6==5)){
            user2points=user2points+500;}
            if((d3==6 && d4==6 && d5==6)||(d3==6 && d4==6 && d6==6)||(d4==6 && d5==6 && d6==6)){
            user2points=user2points+600;}

                if(d3==1){
                user2points=user2points+100;}
                if (d4==1){
                user2points=user2points+100;}
                if (d5==1){
                user2points=user2points+100;}
                if (d6==1){
                user2points=user2points+100;}
                if (d3==5){
                user2points=user2points+50;}
                if (d4==5){
                user2points=user2points+50;}
                if (d5==5){
                user2points=user2points+50;}
                if (d6==5){
                user2points=user2points+50;}
                if( d3!=1 && d4!=1 && d5!=1 && d6!=1 && d3!=5 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!   No points for you!");
                user2points=0; 
                System.out.println("Current points:" + user2points); 
                break; }
            System.out.println("Player2 sum is currently:"+user2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer2= scan.nextInt(); 
        }
        if (answer2==3){
            int d4 =random.nextInt(6)+1; 
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d4: "+d4+" d5: "+d5+" d6: "+d6);
            if((d4==1 && d5==1 && d6==1)){
            user2points=user2points+1000;}
            if((d4==2 && d5==2 && d6==2)){
            user2points=user2points+200;}
            if((d4==3 && d5==3 && d6==3)){
            user2points=user2points+300;}
            if((d4==4 && d5==4 && d6==4)){
            user2points=user2points+400;}
            if((d4==5 && d5==5 && d6==5)){
            user2points=user2points+500;}
            if((d4==6 && d5==6 && d6==6)){
            user2points=user2points+600;}
    
                if (d4==1){
                user2points=user2points+100;}
                if (d5==1){
                user2points=user2points+100;}
                if (d6==1){
                user2points=user2points+100;}
                if (d4==5){
                user2points=user2points+50; }
                if (d5==5){
                user2points=user2points+50; }
                if (d6==5){
                user2points=user2points+50;}
                if( d4!=1 && d5!=1 && d6!=1 && d4!=5 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!");
                user2points=0; 
                System.out.println("Current points:" + user2points); 
                break; }
            System.out.println("Player2 sum is currently:"+user2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer2= scan.nextInt(); 
        }
        if (answer2==2){
            int d5= random.nextInt(6)+1;
            int d6= random.nextInt(6)+1;
            System.out.println(" d5: "+d5+" d6: "+d6);

                if (d5==1){
                user2points=user2points+100;}
                if (d6==1){
                user2points=user2points+100;}
                if (d5==5){
                user2points=user2points+50;}
                if (d6==5){
                user2points=user2points+50;}
                if( d5!=1 && d6!=1 && d5!=5 && d6!=5){
                System.out.println("Farkle!  No points for you!"); 
                user2points=0; 
                System.out.println("Current points:" + user2points); 
                break;}
            System.out.println("Player 2 sum is currently:"+user2points);
            System.out.println("How many dice would you like to roll again? Press 9 to stop"); 
            answer2= scan.nextInt(); 
        }
        if (answer2==1){
                int d6= random.nextInt(6)+1;
                System.out.println(" d6: "+d6);
            
                    if (d6==1){
                    user2points=user2points+100;}
                    if (d6==5){
                    user2points=user2points+50;}
                    if(d6!=1 && d6!=5){
                    System.out.println("Farkle!  No points for you!"); 
                    user2points=0; 
                    System.out.println("Current points:" + user2points); 
                    break;}
                System.out.println("Player2 sum is currently:"+user2points);
                System.out.println("Wow!! Hot dice!! Enter 11 to continue rolling! Press 9 to stop");     
        }
    }
}

if (user2points>totalpoints||user1points>totalpoints){ 
    if (user2points>user1points){
        System.out.println("Player 2 wins! total points:" + user2points);
        System.out.println("Player 1 lost! Total points:" +user1points);}
    if (user2points<user1points){
        System.out.println("Player 1 wins! total points:" + user1points);
        System.out.println("Player 2 lost! total points:" + user2points);}
}



}
}

