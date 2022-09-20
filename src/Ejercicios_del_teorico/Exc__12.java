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


public class Exc__12 {   
    public static void isMultiplo (int num1, int num2){
        
        if  ((num1 % num2) == 0){
            System.out.println("The first number is multiplot of the second.");
        } else{
            System.out.println("The first number is not multiplot of the second.");
        }
    }
    
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
       
       
        
        System.out.print("Enter the first number:  ");
        int numOne = read.nextInt();
        
        System.out.print("Enter the second number:  ");
        int numTwo = read.nextInt();
        
        isMultiplo(numOne, numTwo);
        
    }
    
    
    
    
    
}
