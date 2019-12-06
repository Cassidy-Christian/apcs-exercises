public class Weatherinfo{

 
    private double temp; 
    private double geoinfo; 
    private double targettemp; 

    public Weatherinfo(double geoinfo, double temp, double targettemp){
          this.geoinfo=geoinfo; 
          this.temp=temp; 
          this.temp=targettemp; 
    }
    public double getgeoinfo(){
        return geoinfo; 
    }
    public double gettemp(){
        return temp; 
    }
    public double gettaregttemp(){
        return targettemp; 
    }
    public void setgeoinfo(double geoinfo){
        if (geoinfo>=0)
        this.geoinfo=geoinfo; 
    }
    public void settemp(double temp){
        if (temp>=0)
        this.temp=temp; 
    }
    public void settargettemp(double targettemp){
        if (targettemp>=0)
        this.targettemp=taregttemp; 
    }
 }
    