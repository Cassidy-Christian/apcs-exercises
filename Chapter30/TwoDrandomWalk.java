import java.util.*; 

public class TwoDrandomWalk{

    public static void main( String[] args) {

        Scanner scan =  new Scanner (System.in);
        Random random = new Random();

  
        double x, y; 
        System.out.println("Pick random amount for x ");
            x= scan.nextDouble(); 

            System.out.println("Pick random amount for y ");
            y= scan.nextDouble();  
            
            System.out.println("Number of iterations");
            double iterations= scan.nextDouble();  

            while (iterations>0){
                int num1 =random.nextInt(2)-1; 
                int num2= random.nextInt(2)-1;
                x= x+num1; 
                y=y+num2; 
                iterations-=1; 
            }
            double Inside= (x*x)+(y*y); 
            double distance = Math.sqrt(Inside); 

            System.out.println("Distance="+distance); 
    }
}