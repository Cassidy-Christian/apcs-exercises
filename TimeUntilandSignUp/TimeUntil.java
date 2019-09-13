import java.time.LocalDateTime;
import java.util.Scanner;


public class TimeUntil{
    public static void main(String[] args){
         
        int nowSec=LocalDateTime.now().getSecond();
        int nowMin=LocalDateTime.now().getMinute();
        int nowHour=LocalDateTime.now().getHour();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter hour");
        int hour = Integer.parseInt(scan.nextLine());

        while(hour>=24 || hour<nowHour){
            System.out.print("Invalid hour");
            hour= Integer.parseInt(scan.nextLine());
        }

        System.out.println("Enter minute");
        int minute = Integer.parseInt(scan.nextLine());
    
        while(minute>60 || minute<0 || (minute<nowMin && hour==nowHour)){ //minutes are VALID (0-59) || (minutes>nowMin && hours==nowHours)
            System.out.print("Invalid minute");
            minute= Integer.parseInt(scan.nextLine());
        } 

        System.out.println("Enter second");
        int second = Integer.parseInt(scan.nextLine());
            
        while(second>60 || second<0 || (second<=nowSec && minute==nowMin && hour==nowHour)){
            System.out.print("Invalid second");
            second= Integer.parseInt(scan.nextLine());
        }
        
        int newHour= hour-nowHour;
        int newMin= minute-nowMin;
        int newSec= second-nowSec; 
        
       
        //-59<0  so: newHour-=1; newMin+=60;
        if(newMin<0){ //adjust minutes
            newHour-=1;
            newMin+=60;
        }
        
        //-58<0  so: newMin-=1; newSec+=60;
        if(newSec<0){ //adjust seconds
            newMin-=1;
            newSec+=60;
        }
        
        String result="";
        if(newHour>0){
            result+=newHour;
            result+=" hour";
            if(newHour>1)
                result+="s";
        }
        result+=" ";

        String result1="";
        if(newMin>0){
            result1+=newMin;
            result1+=" Minute";
            if(newMin>1)
                result1+="s";
        }
        result1+=" ";

        String result2="";
        if(newSec>0){
            result2+=newSec;
            result2+=" Second";
            if(newSec>1)
                result2+="s";
        }
        result1+=" ";
            //add something for hours
        //check minutes
            //add something for minutes
        //check seconds
            //add something for seconds
            
        result=result.trim();
     
        
        
        System.out.format("Given %2d:%2d:%2d at %2d:%2d:%2d->\t%s %s %s",hour,minute,second,nowHour,nowMin,nowSec,result,result1, result2);
    }
    
}