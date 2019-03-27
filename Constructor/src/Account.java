
import java.util.Scanner;


public class Account {
    private String accountNo;
    private double money;
    private String name;
    private String email;
    private String phoneNo;
    
    public void showInfo(){
        System.out.println("Account No: " + this.accountNo);
        System.out.println("Money: " + this.money);
        System.out.println("Name: " + this.name);
        System.out.println("E-mail: " + this.email);
        System.out.println("Phone No: " + this.phoneNo);
    }
    
    public Account(){
        this("No info", 0.0, "No info", "No info", "No info");
    }
    
    
    public Account(String accountNo, double money, String name, String email, String phoneNo){
        this.accountNo = accountNo;
        this.email = email;
        this.money = money;
        this.phoneNo = phoneNo;
        this.name = name;
    }
    
    Scanner scan =new Scanner(System.in);
    
    public void add(double value) {                
        if(value<=0)
            System.out.println("İnvalid Proccess");
        money += value;
        System.out.println("Your money: " + money);
    }
    public void withdraw(double value){        
        if(value>money)
            System.out.println("You don't have that much...");
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
    
    

   
    public String getAccountNo() {
        return accountNo;
    }

   
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    
    public double getMoney() {
        return money;
    }

    
    public void setMoney(double money) {
        this.money = money;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getPhoneNo() {
        return phoneNo;
    }

   
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
}
