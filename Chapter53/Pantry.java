class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }
  Pantry(Jam jar1, Jam jar2){
      this.jar1=jar1; 
      this.jar2=jar2;
      this.jar3=null; 
      selected=null; 
      
  }

  // Methods
  public String toString()
  {
    String str = "";
    
    if (jar1 != null)
        str += "1: " +  jar1.toString()  + "\n";
    
    if (jar2 != null)
        str += "2: " +  jar2.toString()  + "\n";
    
    if (jar3!=null)
        str += "3: " +  jar3.toString()  + "\n"; 
    
    return str;
  }
  public void print(){
      System.out.println(this.toString());
  }
  public void replace(Jam j, int slot){
    if (slot==1)
      jar1=j; 
    if(slot==2)
    jar2=j; 
    if(slot==3)
    jar3=j; 
}

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 && jar1 != null){
      selected = jar1;
      return true; 
    }
    else if ( jarNumber == 2 && jar2!=null){
      selected = jar2 ;
      return true; 
    }
    else if ( jarNumber == 3 && jar3!=null){
        selected =jar3; 
        return true; 
    }
      else 
        return false; 
      
  }

  // spread the selected jam
  public void spread( int oz )
  {
    if (selected != null) 
    selected . spread( oz ) ;
  
}
}