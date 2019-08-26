public class Trigonometry
{
    public static void main ( String[] args )
    {
        double sinValue =  Math.sin( 0.5236 );
        double cosValue = Math.cos( 0.5236 );

        double sum=Math.pow(sinValue,2)+Math.pow(cosValue,2);

System.out.println("sine: " + sinValue + " cosine: " + cosValue + " sum of squares: " + sum );
    }
    
}