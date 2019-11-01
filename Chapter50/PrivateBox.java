// file: Box.java
//
public class PrivateBox
{
  public double length;  // length of the box
  public double height;  // height of the box
  public double width; //width of the box 
  
  public PrivateBox (double side){
   this.length= side;
   this.width=side; 
   this.height=side; 
   //return new Box(side,side,side);
  }
  
  public PrivateBox ( double width, double height, double length )
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
  
}