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
public class Exc_1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter an integer number:  ");
        int num1 = read.nextInt();
        
        System.out.print("Enter another integer number:  ");
        int num2 = read.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("  ");
        System.out.println("The sum between the numbers is:  " + sum);
    }
}
