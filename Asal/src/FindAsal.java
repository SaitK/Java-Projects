/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Said
 */
public class FindAsal {    
    public static void main(String[]args){
        
        for(int i=2; i<1000; i++){
            
            boolean bool = true;
            
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    bool = false;
                }       
            }            
            
            if(bool)
                System.out.println(i);
        }
    }
    
    /*
    public static boolean Find(int number){
                
        for(int j=2; j<number; j++){
            if(number%j == 0){
                return false;
            }       
        }
        return true;
    }*/
    
}
