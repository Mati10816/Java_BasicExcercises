/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_exercises;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Exc_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
                
        System.out.print("Enter the number of centigrade degrees:  ");
        float centigrade = read.nextFloat();
        
        float fahrenheit = 32 + (9*centigrade / 5);
        
        System.out.println("The equivalent in Fahrenheit degrees is: " + fahrenheit);
                
    }
    
}
