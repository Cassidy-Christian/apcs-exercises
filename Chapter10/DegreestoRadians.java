public class DegreestoRadians
{
    public static void main ( String[] args )
    {
        double rad = 30 * Math.PI/180;  
        double sinValue =  Math.sin( rad );
        double cosValue = Math.cos( rad );

        double sum=Math.pow(sinValue,2)+Math.pow(cosValue,2);

System.out.println("sine: " + sinValue + " cosine: " + cosValue + " sum of squares: " + sum );
    }
    
}