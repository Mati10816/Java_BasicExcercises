/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_del_teorico;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Exc_6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNum = read.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNum = read.nextInt();
        
        
        if ((firstNum > 25) && (secondNum > 25)) {
            System.out.println("Both numbers are superiors to 25.");
        } else if (firstNum > 25) {
            System.out.println("Only the first number is superior to 25.");           
        } else if (secondNum > 25) {
             System.out.println("Only the second number is superior to 25.");           
        } else {
            System.out.println("None of the numbers is larger than 25.");
        }
        
    }

    
}