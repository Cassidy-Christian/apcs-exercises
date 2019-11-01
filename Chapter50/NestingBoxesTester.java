class NestingBoxesTester
{

  public static void main ( String[] args )
  {
    NestingBoxes box = new  NestingBoxes( 2.5, 5.0, 6.0 ) ;
    NestingBoxes b2=box.biggerBox(box);

     System.out.println( "Area: "  + box.surfaceArea() + " volume: " + box.volume() );

     System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() +
                         " width:  " + box.getWidth()+" test old box length:"+box.getLength()+" test old box height:"+box.getHeight()+" test old box width: "+box.getWidth()+" 1.25X greater length:"+b2.getLength()+"test if it fits: "+box.nests(box))  ;

  }
}
