import java.util.Scanner; 

public class FreeResponsePractice
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

double yearly_income, total_paid, subtract_lasttotal, percent; 


System.out.println("insert yearly income");
yearly_income = scan.nextDouble();

if (yearly_income<15000)
{
    total_paid=yearly_income*0; 
}
else if ((15000<yearly_income) && (yearly_income<35000));
{
    subtract_lasttotal=yearly_income-15000;
    total_paid=subtract_lasttotal*.1;
}
if ((35000<yearly_income) && (yearly_income<65000))
{
    subtract_lasttotal=yearly_income-35000; 
    total_paid=(subtract_lasttotal*.16)+2000;
}
else if ((65000<yearly_income) && (yearly_income<105000))
{
    subtract_lasttotal=yearly_income-65000;
    total_paid=(subtract_lasttotal*.19)+6800; 
}
else if (yearly_income>105000)
{
    subtract_lasttotal=yearly_income-105000; 
    total_paid=(subtract_lasttotal*.22)+14400; 
}
else {
    System.out.println("No taxes for you");
}

percent= (total_paid/yearly_income)*100; 

System.out.println("Total Paid:" + total_paid);
System.out.println( percent + "% of " + yearly_income);
}
}