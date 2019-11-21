import java.io.* ;

class SumofEvenOddandAllElements
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    //double sum = data[0]+data[1]+data[2]+data[3]+data[4]+data[5]+data[6]+data[7]+data[8]; 
    
    int total= 0; 
    int evensum=0; 
    int oddsum=0; 
    int i=0; 

    //total =  total + data[ index ]  ;

    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
      total =  total + data[ index ]  ;

      while(data[i]<=data.lenth-1){
        if(data[i]%2==0){
          evensum=+data[i]; 
          System.out.println("Even Sum:" + evensum );
          data.length=-1; 
        }
    
        if(data[i]%2==1){
            oddsum=+data[i];
            System.out.println("odd Sum:" + oddsum );
            data.length=-1; 
        }

    }
    }
    // write out the three sums
    System.out.println("Total sum:"+ total );
    System.out.println("Even Sum:" + evensum );
    System.out.println("odd Sum:" + oddsum );

  }
} 