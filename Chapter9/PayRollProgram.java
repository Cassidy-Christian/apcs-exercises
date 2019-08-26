public class PayRollProgram
{  
  public static void main ( String[] args )  
  {
    int hoursWorked; // hoursWorked is declared without an initial value
    double payRate, // payRate is declared without an initial value
           taxRate; // taxRate is declared without an initial value

    hoursWorked= 40; // hoursWorked is declared without an initial value
    payRate = 10; // payRate is declared without an initial value
    taxRate =.10 ; // taxRate is declared without an initial value

    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}