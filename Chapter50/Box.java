// file: Box.java
//
public class Box
{
  private double length;  // length of the box
  private double height;  // height of the box
  private double width; //width of the box 
  
  public Box (double side){
   this.length= side;
   this.width=side; 
   this.height=side; 
   //return new Box(side,side,side);
  }
  
  public Box ( double length, double height, double width)
  {
    this.length = length;
    this.height = height;
    this.width = width; 
  }
  
  public double surfaceArea()
  {
    return (2*((width*length)+(height*length)+(height*width)));
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