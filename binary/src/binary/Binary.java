
package binary;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
 
        int sayi = inp.nextInt();
        String decimalString ="";
 
 
        for(int i = sayi;i>0;i/=2){
            decimalString = (i%2)+ decimalString;
        }
        System.out.println(decimalString);
    }
 
}