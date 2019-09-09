public class AStringMethodthatcreatesanewString
{
  public static void main ( String[] args )
  {
    String str;
    int    len;

    str = new String("2020");
    String second;
    
    second = str.trim();

    len = second.length();

    System.out.println("The length is: " + len );
    System.out.println(">"+str+":"+second+"<");

  }
}   