// file: Box.java
//
public class NestingBoxes
{
  public double length;  // length of the box
  public double height;  // height of the box
  public double width; //width of the box 

  public NestingBoxes (double side){
   this.length= side;
   this.width=side; 
   this.height=side; 
   //return new Box(side,side,side);
  }

    public NestingBoxes(NestingBoxes oldbox){
    this.length=oldbox.getLength(); 
    this.width=oldbox.getWidth(); 
    this.height=oldbox.getHeight(); 
    }
 public NestingBoxes biggerBox(NestingBoxes oldbox){
      return new NestingBoxes(1.25*oldbox.getWidth(), 1.25*oldbox.getHeight(), 1.25*oldbox.getLength()); 
  }
  public NestingBoxes( double width, double height, double length) 
  {
    this.length = length;
    this.height = height;
    this.width = width; 
  }
  private double faceArea(){
      return (length*height); 
  }
  private double topArea(){
      return (length*width); 
  }
  private double sideArea(){
      return (width*height);
  }
  public double surfaceArea()
  {
    return ((2*faceArea())+(2*topArea())+(2*sideArea()));
  }
  
  public double volume()
  {
    return (width*height*length);
  }
  
  public void setHeight( double height )
  {
    if ( height >= 0 )
      this.height = height ;
  }
  
  public void setWidth( double width )
  {
    if ( width >= 0 )
      this.width = width ;
  }
  public void setLength( double length)
  {
      if (length>=0)
      this.length=length; 
  }
  
  public double getHeight( )
  {
    return height ;
  }
  
  public double getWidth( )
  {
    return width ;
  }
  public double getLength()
  {
      return length; 
  }
public boolean nests( NestingBoxes outsideBox ){
    double l1=outsideBox.getLength();
    double h1=outsideBox.getHeight();
    double w1=outsideBox.getWidth();
    double h2=this.height;
    double w2=this.width;
    double l2=this.length;
    
    if((l2>l1 && l2>w1 && l2>h1)||(w2>l1 && w2>w1 && w2>h1)||(h2>l1 && h2>w1 && h2>h1)){
        return false;
    } 
    if((l2<l1 && l2<w1 && l2<h1)||(w2<l1 && w2<w1 && w2<h1)||(h2<l1 && h2<w1 && h2<h1)){
        return true; 
    }
    else {
        return true; 
    }
        
} 

}