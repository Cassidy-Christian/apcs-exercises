import java.util.*; 

public class PasswordCracker{

    public static void main( String[] args) {
    
        Scanner scan = new Scanner( System.in );
        Random random = new Random();
    
        int runs =0; 
        System.out.print( "Enter a secret password-->" );
        String digits = scan.nextLine();
    
        String choices = "abcdefghijklmnopqrstuvwxyz" ;
        String password= ""; 
        int length = digits.length(); 
    
      int cl=0;
      int cp=0;
    
    
      for(;cp<5;cp++){
        for(cl=0; cl<26; cl++){
            System.out.print(choices.charAt(cl)+":"+digits.charAt(cp)+"\t");
            runs+=1;
            if(choices.charAt(cl)==digits.charAt(cp)){
                password+=choices.charAt(cl); 
                break;
            }
        
        }
        if(password.equals(digits)){
            System.out.println("Here is your password:"+password); 
            System.out.println("It took"+runs+ "tries to guess it");
            break;
        }
      }
    
    }
}