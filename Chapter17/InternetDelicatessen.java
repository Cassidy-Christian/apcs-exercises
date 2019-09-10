import java.util.Scanner;

public class InternetDelicatessen
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String item; 
        double price, overnight_delivery,  total, delivery, overnight_delivery_cost;
         
    
        System.out.println("Enter the item: ");
         item = scan.nextLine();

        System.out.println("Enter the price: ");
        price = scan.nextDouble();

        if(price<10)
        {
            delivery= 2;
        } 
        else {
            delivery= 0; }
  

        System.out.println("Overnight delivery (0==no, 1==yes):");
        overnight_delivery = scan.nextDouble();

        if (overnight_delivery==1){
            overnight_delivery_cost = 3; 
        }
        else {
            overnight_delivery_cost=0; }

        

            total= price + delivery + overnight_delivery_cost; 

            System.out.println("Invoice: ");
            System.out.println(item +"    "+ price);
            System.out.println("delivery " + delivery);
            System.out.println("total " + total);
        }
    }