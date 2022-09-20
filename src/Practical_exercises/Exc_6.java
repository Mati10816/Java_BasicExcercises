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
public class Exc_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter one integer number");
        int num = read.nextInt();
        
        if ((num%2)==0){
            System.out.println("The numer is even.");            
        }else{
            System.out.println("The number is odd.");
        }
        
        
        
        
    }
}
