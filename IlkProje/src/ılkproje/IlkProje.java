/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ılkproje;

import java.util.Scanner;
import javax.swing.SizeRequirements;

/**
 *
 * @author Said
 */
public class IlkProje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculate();
        
        
    }
    public static void Calculate(){
        double BKI;
        double weight;
        double height;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your weight(kg): ");
        weight = scan.nextDouble();
        
        System.out.print("Enter your height(m): ");
        height = scan.nextDouble();
        
        BKI = weight/(height*height);
        System.out.println("Your body index is: " + BKI);
        
    }
    
}
