
package workers;

import java.util.Scanner;
import sun.org.mozilla.javascript.internal.Token;

public class Main {
    
    
    
    public static void main(String[] args) { 
        /*        
        Developer developer1 = new Developer("S", "K", 32, "Java");
        
        developer1.showInfo();
        
        Manager manager1 = new Manager("S", "K", 32, 2);
        
        manager1.showInfo();
        */
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Welcome...");
        
        String options = "Options...\n"
                       + "1. Options for Developer\n"
                       + "2. Options for Manager\n"
                       + "For Quitting, press 'q' ...";
        
        System.out.println("*************************");
        System.out.println(options);
        System.out.println("*************************");
        
        while(true){
            System.out.print("Choose the option:");
            String choose = scan.nextLine();
            if(choose.equals("q")){
                System.out.println("Quitting...");
                break;
            }
            else if(choose.equals("1")){
                Developer developer1 = new Developer("S", "K", 712, "Java, Python");
                String optionDeveloper = "Options for Developers\n"
                                       + "1. Format\n"
                                       + "2. Show Info\n"
                                       + "For Quitting, press q...";
                
                while(true){
                    System.out.println("Choose the option: ");
                    System.out.println(optionDeveloper);
                    String choose1 = scan.nextLine();
                    if(choose1.equals("q")){
                        System.out.println("Quitting...");
                        break;
                    }
                    else if(choose1.equals("1")){
                        System.out.print("Which OS do you want: ");
                        String OS = scan.nextLine();
                        developer1.format(OS);
                        
                        
                    }
                    else if(choose1.equals("2")){
                        developer1.showInfo();                                               
                    }
                    else{
                        System.out.println("Invalid option...");
                    }
                    
                }
                
            }
            else if(choose.equals("2")){ 
                Manager manager1 = new Manager("H", "K", 1, 32);
                String optionManager = "Manager Options\n"
                                     + "1. Raise Salary\n"
                                     + "2. Show Info\n"
                                     + "For Quitting, press q...";
                System.out.println(optionManager);
                while(true){
                    System.out.print("Choose the Option: ");
                    String choose2 = scan.nextLine();
                    if(choose2.equals("q")){
                        System.out.println("Quitting...");
                        break;
                    }
                    else if(choose2.equals("1")){
                        System.out.print("How much money do you wanna raise: ");
                        int raise = scan.nextInt();
                        scan.nextLine();
                        manager1.raiseSalary(raise);
                    }
                    else if(choose2.equals("2")){
                        manager1.showInfo();
                    }
                    else{
                        System.out.println("Invalid Option...");
                    }
                }
                     
                
            }
            else{
                System.out.println("Invalid Option...");
                
            }
        }
        
        
    }
    
}
