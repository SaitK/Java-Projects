
package palindromik;

import java.util.Scanner;

public class Palindromik {
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        

  
        while(true){
            String input;
            String inputR = "";
            System.out.println("Çıkmak için q'ya basınız");           
            System.out.print("Kelime giriniz: ");
            input = scan.nextLine();
            for(int i = input.length()-1; i>=0; i--){
                inputR = inputR + input.charAt(i);  
            }
                   
            if(input.equals(inputR)){
                System.out.println("Bu kelime palindromiktir...");
            }            
            else if(input.equals("q")){
                System.out.println("Çıkılıyor...");
                break;
            }
            else{
                System.out.println("Bu kelime palindromik değildir...");
            }
        }       
    }   
}
