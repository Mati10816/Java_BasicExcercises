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
public class Exc_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Write a sentence:  ");
        String sentence = read.next();
        
        sentence = sentence.toUpperCase();        
        System.out.println(sentence);
        
        sentence = sentence.toLowerCase();
        System.out.println(sentence);
        
        
    }
}
