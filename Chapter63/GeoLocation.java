public class Geolocation{

    private double longi1; 
    private double longi2; 
    private double lat1; 
    private double lat2; 
    private String name1; 
    private String name2; 

    public GeoLocation(double longi1, double longi2, double lat1, double lat2, String name1, String name2){
            this.longi1=longi1; 
            this.longi2=longi2; 
            this.lat1=lat1; 
            this.lat2=lat2; 
            this.name1=name1; 
            this.name2=name2; 
    }
    public double haversine(){
        double a= (Math.sin((Math.abs(lat1-lat2))/2)*Math.sin((Math.abs(lat1-lat2))/2))+(Math.cos(lat1)*Math.cos(lat2)*Math.sin((Math.abs(longi1-longi2))/2)*Math.sin((Math.abs(longi1-longi2))/2)); 
        double c= 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
        double distance= 6371*c; 
    }
    public double getlongi1(){
        return longi1; 
    }
    public double getlongi2(){
        return longi2; 
    }
    public double getlat1(){
        return lat1; 
    }
    public double getlat2(){
        return lat2; 
    }
    public String getname1(){
        return name1;
    }
    public String getname2(){
        return name2; 
    }
    public void setlongi1(double longi1){
        if ( longi1 >= 0 )
        this.longi1 = longi1 ;
    }
    public void setlongi2(double longi1){
        if ( longi2 >= 0 )
        this.longi2 = longi2 ;
    }
    public void setlat1(double lat1){
        if(lat1>=0)
        this.lat1=lat1; 
    }
    public void setlat2(double lat2){
        if(lat2>=0)
        this.lat2=lat2; 
    }
    public void setname1(String name1){
      this.name1=name1; 
    }
    public void setname2(String name2){
        this.name2=name2; 
    }
}