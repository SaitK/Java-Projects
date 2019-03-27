
import java.util.Scanner;


public class Login {
    public boolean logup(Account account){
        String userID;
        String password;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your user ID: ");
        userID = scan.nextLine();
        System.out.print("Enter your password: ");
        password = scan.nextLine();
        
        if(account.getUserID().equals(userID) && account.getPassword().equals(password)){
            System.out.println("Welcome, " + userID);
            return true;
        }
        else
        return false;
        
        
    }
    
}
