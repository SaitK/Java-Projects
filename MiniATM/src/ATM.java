
import java.util.Scanner;
import sun.org.mozilla.javascript.internal.Token;


public class ATM {
    public void work(Account account){
        Login login = new Login();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("WELCOME");
        
        System.out.println("*****************");
        System.out.println("User login");
        System.out.println("*****************");
                
        int remain = 3;
        
        while(true){
            if(login.logup(account)){
                
                System.out.println("Login successful...");
                break;
            }
            else{
                System.out.println("Login failed...");
                remain -= 1;
                System.out.println("Remain tries: " + remain);
                
            }   
            if(remain == 0){
                System.out.println("Too many login failure...");
                return;
                        
            }
        }
        
        
        System.out.println("*********************");
        String options = "1. Show money\n"
                         + "2. Add money\n"
                         + "3. Withdraw money\n"
                         + "For Quit press q";
        System.out.println(options);
        System.out.println("*********************");
        
        
        while(true){
            System.out.print("Choose option: ");
            String choose = scan.nextLine();
            if(choose.equals("q")){
                System.out.println("Quitting...");
                break;
            }
            else if(choose.equals("1")){
                System.out.println("Your money: " + account.getMoney());
            }
            else if(choose.equals("2")){
                System.out.print("How much money do you wanna add? ");
                double value = scan.nextDouble();
                scan.nextLine();
                account.add(value);
            }
            else if(choose.equals("3")){
                System.out.print("How much money do you wanna withdraw? ");
                double value = scan.nextDouble();
                scan.nextLine();
                account.withdraw(value);                
            }
            else
                System.out.println("İnvalid value");
                   
        }
        
        
    }
    
}
