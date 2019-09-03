import java.util.Scanner;

public class SignUp{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a new username:");
        String userName=sc.nextLine();
        
        //user name check 
        if(userName.matches("admin person jimbob234"))
        {
            System.out.println("Username already taken. Restart if you receive this message.");
        } 
        else if (userName.matches("skater_gurl17 gary"))
        {
            System.out.println("user name already taken");
        }
        else {
            System.out.println("Username is good! Password must start with a vowel, contain a symbol, not have the username anywhere in the password, and numbers are only allowed in the last two places"); }

            //password check 
        System.out.print("Enter a password:");
        String pass=sc.nextLine();
        
        String lPass=pass.toLowerCase();
        char first=lPass.charAt(0);
        
        if(lPass.matches("^[aeiouy]\\D*?[#!$&]\\D*?\\d{0,2}$") && !lPass.contains(userName.toLowerCase())){
            System.out.println("It's good!");
        } else {
            System.out.println("No good!");
        }
    }
    
}
