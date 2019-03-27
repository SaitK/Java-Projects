/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ılkproje;

import java.util.Scanner;

/**
 *
 * @author Said
 */
public class Hypotenus {
    public static void main(String[] args) {
        triangle();
        
    }
    
    public static void triangle(){
        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double c;
        
        System.out.print("Enter side a: ");
        a = scan.nextDouble();
        
        System.out.print("Enter side b: ");
        b = scan.nextDouble();
        
        c = Math.sqrt((a*a)+(b*b));
        
        System.out.println("The side of hypotenus is: " + c);
        
    }
    
    
}
