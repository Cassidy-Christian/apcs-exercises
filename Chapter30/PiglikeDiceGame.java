import  java.util.Scanner;
import java.util.Random;

public class PiglikeDiceGame{

public static void main( String[] args) {

    Scanner scan = new Scanner( System.in );
    Random random = new Random();

int psum=0;
int csum=0; 

while ((csum<100) && (psum<100)){
    int num1 =random.nextInt(6)+1; 
    int num2= random.nextInt(6)+1;
    int num3= random.nextInt(6)+1;
    
    csum=csum+num1+num2+num3; 
    System.out.println("Computer Score:"+csum);

    int pnum= random.nextInt(6)+1;
if (pnum==1){
    System.out.println("Loose a turn!"); 
    System.out.println(psum); 
}
    if (pnum!=1){
     psum= psum+pnum; 
     System.out.println("Your Score:"+psum);

System.out.println("Roll again?(1=y or 2=n)"); 
    int answer= scan.nextInt();
        while ((answer==1) && (csum<=100) && (psum<=100)){
            int pnum2= random.nextInt(6)+1;
            if (pnum2==1){
                System.out.println("Loose a turn!");
                int num4 =random.nextInt(6)+1; 
                int num5= random.nextInt(6)+1;
                int num6= random.nextInt(6)+1;
                csum= csum +num4+num5+num6;
                System.out.println("Computer Score:"+csum);
            }
            if (pnum2!=1){
                csum=csum+0; 
                psum=psum+pnum2;
                System.out.println("Your Score:"+psum); 
                System.out.println("Computer score:"+csum); 

                System.out.println("Roll again?(1=y or 2=n)"); 
                int answer1= scan.nextInt();
                if (answer1==2){
                    int num4 =random.nextInt(6)+1; 
                    int num5= random.nextInt(6)+1;
                    int num6= random.nextInt(6)+1;
                    csum= csum +num4+num5+num6;
                    System.out.println("Computer Score:"+csum);

                }
            }
        }
            if (pnum==1){
                System.out.println("Loose a Turn!");
                System.out.println(psum);
            }
            
        }
        }       



if(csum>100){
    System.out.println("Computer wins!");
}
else{
    System.out.println("you win!");
}


}
}