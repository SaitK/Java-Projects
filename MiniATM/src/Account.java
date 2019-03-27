
import sun.org.mozilla.javascript.internal.Token;


public class Account {
    private String userID;
    private String password;
    private double money;

    public Account(String userID, String password, double money) {
        this.userID = userID;
        this.password = password;
        this.money = money;
    }
    
    public void add(double value) {                
        if(value<=0)
            System.out.println("İnvalid Proccess");
        money += value;
        System.out.println("Your money: " + money);
    }
    public void withdraw(double value){        
        if(value>money){
            System.out.println("You don't have that much...");
            System.out.println("Your money: " + money);
            
        }
        else{
        money -= value;
        System.out.println("Your money: " + money);
        }
    }
    public void transfer(double value, String accountiban){
         money -= value;
         System.out.println("Money Transfered...");
         System.out.println("Your money: " + money);
                
    }
    

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
    
}
