/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_del_teorico;

import java.util.Scanner;

/**
 *
 * @author Matias Fernandez
 */
public class Exc_5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        
        System.out.print("Enter a decimal number: ");                
        double num = read.nextDouble();
        
        System.out.print("Enter the first letter of your name: ");
        char letter = read.next().charAt(0);
        
        System.out.print("Are you Mati? Enter True or False: ");
        boolean question = read.nextBoolean();
        
        
        
    }
         
}
