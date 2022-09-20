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
public class Exc_7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter a sentence:  ");
        String sentence = read.nextLine();
        
        if (sentence.equals("eureka")){
            System.out.println("The sentence you enter is eureka!");
        }else{
            System.out.println("Thank you.");
        }
    }
}
