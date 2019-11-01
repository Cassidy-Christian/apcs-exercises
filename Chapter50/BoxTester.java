class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;
     Box box2= new Box(5.0); 

     System.out.println( "Area: "  + box2.surfaceArea() + " volume: " + box2.volume() );

     System.out.println( "length: " + box2.getLength() + " height: " + box2.getHeight() +
                         " width:  " + box2.getWidth() )  ;

  }
}
