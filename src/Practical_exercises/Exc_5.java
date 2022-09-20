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
public class Exc_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter one number:  ");
        float num = read.nextFloat();
        
        float doubl = num * 2;
        float triple = num * 3;
        float squareRoot = (float) Math.sqrt(num);
        
        System.out.println("");
        System.out.println("The double of the number is: " + doubl);
        System.out.println("The triple of the number is: " + triple);
        System.out.println("The square root of the number is: " + squareRoot);
        
    }
}
