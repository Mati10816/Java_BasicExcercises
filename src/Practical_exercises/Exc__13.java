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
public class Exc__13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides to make a square:  ");
        int sides = input.nextInt();

        for (int i = 0; i < sides; i++) {           
            for (int j = 0; j < sides; j++) {
                
                if (i == 0 || i == sides-1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == sides-1){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }

            }
            
            System.out.println(" ");
            

        }
        
    }

}
