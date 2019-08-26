public class Reassign3
{  
    public static void main ( String[] args )  
  {
      double x = 0.0; 
      double res = (3 * x * x) - (8 * x) + 4; 
      
      //x = (3 * x * x) - (8 * x) + 4;
      System.out.println(res);

      x = 2.0; 
      res=(3 * x * x) - (8 * x) + 4;
      System.out.println(res);

      x = 4.0;
      res=(3 * x * x) - (8 * x) + 4;
      System.out.println(res);
  }
}