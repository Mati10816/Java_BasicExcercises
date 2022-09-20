package Practical_exercises;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hogar
 */
public class Exc_9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter a sentence:  ");
        String sentence = read.nextLine();
        
        String firstLetter = sentence.substring(0, 1);
        
        if ("A".equals(firstLetter)){
            System.out.println("CORRECT");
        }else{
            System.out.println("INCORRECT");
        }
        
    }
}
