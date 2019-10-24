public class CylinderTester
{
    public static void main ( String[] args ) {
        CylinderClass cylinder = new CylinderClass(7,8); 

for(int i=7;i<12;i++){
    System.out.println("sa: "+cylinder.surfaceArea()+"\tvol: "+cylinder.volume());
    cylinder.setRadius(i);
    cylinder.setHeight(i+1);
        System.out.println("Radius vaule: "+cylinder.getRadius());
    System.out.println("Height value: "+cylinder.getHeight());
}
    }
}