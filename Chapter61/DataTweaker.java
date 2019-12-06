class DataTweaker
{
  public static void main ( String[] args )
  {
    double[] val = {13.0, 5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9}; 
   double  n=val.length; 
    double sum=0; 
    for (int i = 0; i < n; i++) {
    sum += val[i]; 
  }
  double average= sum/n; 
  int newsum= 0; 
  int discard=0;
  double bsf=val[0];
  for (int i =0; i<n; i++){
      if(Math.abs(average-val[i])>bsf){
          bsf=Math.abs(average-val[i]);
          discard=i;
      }
  }
      for (int i = 0; i < n; i++) {
          if (i==discard){
              continue;
          }
      newsum += val[i]; 
       
    }
    double newaverage= newsum/(n-1);
    System.out.println( " Original Average = " + average );
  System.out.println("New Average=" +newaverage); 
 
   }
}