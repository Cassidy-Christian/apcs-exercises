class PrivateBoxTester
{

  public static void main ( String[] args )
  {
     PrivateBox box = new  PrivateBox( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.surfaceArea() + " volume: " + box.volume() );

     System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() +
                         " width:  " + box.getWidth())  ;

  }
}