
package ebobbul;

import java.util.Scanner;

public class EbobBul {

    public static void main(String[] args) {
        int ilkSayi;
        int ikinciSayi;
        int ebob = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        ilkSayi = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        ikinciSayi = scan.nextInt();
        
        for(int i = 1; i<=ilkSayi && i<=ikinciSayi ;i++){
            if(ilkSayi%i==0 && ikinciSayi%i==0){
                ebob = i;
                System.out.println(ebob);
                
            }
            
        }
        System.out.println("EBOB: " + ebob);
       
    }
    
}
