import java.util.Scanner;

public class SignUp{
    
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        
        
        System.out.print("Enter a new username:");
        String userName=scan.nextLine();
     //username check
    while(userName.equalsIgnoreCase("admin person") || userName.equalsIgnoreCase("skater_gurl17")){
         System.out.print("Username already taken. Enter a new username:");
         userName=scan.nextLine();
}
       

            //password check 
        System.out.print("Enter a password. Password must start with a vowel, include a symbol, not contain the username, and can only have two numbers at the end.");
            String pass=scan.nextLine();
        
            String lPass=pass.toLowerCase();
            char first=lPass.charAt(0);
        
        if(lPass.matches("^[aeiouy]\\D*?[#!$&]\\D*?\\d{0,2}$") && !lPass.contains(userName.toLowerCase())){
            System.out.println("It's good!");
        } else {
            System.out.println("No good!");
        }
    }
}
