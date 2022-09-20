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
public class Exc__11 {
    
    public static String transformation(String text){
        String newText = "";
        int len = text.length();
        
        
        for (int i = 0; i < len ; i++) {
            String letter = text.substring(i, i+1);            
            
            switch (letter){
                case "a":
                    letter = "@";  
                    break;
                case "e":
                    letter = "#";
                    break;
                case "i":
                    letter = "$";
                    break;
                case "o":
                    letter = "%";
                    break;
                case "u":
                    letter = "*";           
                    break;
            }             
            
            newText = newText.concat(letter);
        }       
        return newText;        
    }
    
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter a sentence (end whit a dot):  ");
        String sentence = read.nextLine();
        
        sentence = sentence.toLowerCase();
        
        String newSentence = transformation(sentence);
        
        System.out.println("The sentence transformed would be:  " + newSentence);
    }
    
    
    
    
    
    
}




