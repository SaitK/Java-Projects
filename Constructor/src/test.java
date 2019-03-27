
public class test {
    public static void main(String[] args) {
        
        Account account1 = new Account("9465852-1", 14650, "Ferdi", "ferditayfur@gmail.con", "123456789");
        Account account2 = new Account();
        account1.add(350);
        account1.withdraw(1200);
        account1.transfer(1500, "9784651333");
        account1.withdraw(12400);
        
        
        System.out.println(account2.getAccountNo());
        account1.showInfo();
        
        
        
    }
    
}
