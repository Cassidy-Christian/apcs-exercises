class BoxConstructorTester
{

  public static void main ( String[] args )
  {
     BoxConstructor box = new  BoxConstructor( 2.5, 5.0, 6.0 );
     BoxConstructor box2 = new  BoxConstructor(box);

     System.out.println( "Area: "  + box.surfaceArea() + " volume: " + box2.volume() );

     System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() +
                         " width:  " + box.getWidth())  ;

  }
}