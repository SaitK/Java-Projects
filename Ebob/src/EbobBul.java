/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Said
 */
public class EbobBul {
    public static void main(String[] args) {
        System.out.println(FindEbob(120, 8));
        
        
        
    }

    public static int FindEbob(int a, int b){
        int ebob = 1;
        
        for(int i=1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i == 0){
                ebob = i;
            }
        
        }
        return ebob;
        
        
    }
    
    
}
