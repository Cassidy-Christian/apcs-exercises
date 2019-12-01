class Constructor
{
    
  private int[] data;
  
  // Constructor
  public Constructor(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    int a[]= new int[data.length]; 
    
    // Copy values from the 
    // input data to data.
    for ( int j = 1 ; j < data.length ; j++ )
    {
      a[j] = data[j]; 
    }
  
  
  //Print
  for (int j=0;j<a.length;++j)
  {
    System.out.println(a[j]+""); 
 
  }
  new average()
  {

    double  n=data.length; 
     double sum=0;  
     for (int i = 0; i < data.length; i++) {
     sum += data[i]; 
   }
   double average= sum/n; 
  
  }
}
}



