
import java.util.Scanner;
import javax.print.attribute.standard.Finishings;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome, Workout Moves");
        
        String moves = "*******\n" 
                     + "Burpee: \n"
                     + "Squat: \n"
                     + "Push_Up: \n"
                     + "Lunge: \n"
                     + "********";
        System.out.println(moves);
        
        System.out.println("Burpee number: ");
        int burpee = scan.nextInt();
        
        System.out.println("Squat number: ");
        int squat = scan.nextInt();
        
        System.out.println("Push_Up number: ");
        int push_up = scan.nextInt();
        
        System.out.println("Lunge number: ");
        int lunge = scan.nextInt();
        
        scan.nextLine();
        
        Work work = new Work(burpee, push_up, squat, lunge);
        
        
        
        
        while(work.finish() == false){
            
            System.out.print("Moves: burpee, push_up, squat, lunge ");
            String move =scan.nextLine();
            System.out.print("How many?");
            int number = scan.nextInt();
            scan.nextLine();
            work.dowork(move, number);
            
            
                    
            
        }
        
    }
    
}
