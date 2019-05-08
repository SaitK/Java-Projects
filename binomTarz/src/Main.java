
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = scan.nextInt();
        for(int i = sayi; i>=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print(j +" ");
            }
            for(int k = 2; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    
}
