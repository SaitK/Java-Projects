
public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        
        Account account = new Account("SK", "357246", 15000);
        
        
        atm.work(account);
        
        
    }
}
