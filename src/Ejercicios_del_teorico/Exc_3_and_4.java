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
public class Exc_3_and_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);    
        //Excercise 3
        int num1 = 5;
        int num2 = 6;        
        int suma = num1 + num2;        
        double division = num1 / num2;
        boolean bandera = num2 > num1;        
        num1 = -num1--;        
        System.out.println("The first number is less than the second? " + bandera);
        
        
        //Excercise 4
        System.out.println("  ");                
        System.out.print("Enter your name: ");
        String name = read.nextLine();
        
        System.out.print("Enter your age: ");
        int age = read.nextInt();
        
        System.out.println("Hello " + name +", " + age + " it´s a great age!!!");
        
        
        
        
                
        
     
        
    }
}
