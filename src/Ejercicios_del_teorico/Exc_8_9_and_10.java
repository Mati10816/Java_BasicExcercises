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
public class Exc_8_9_and_10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //Excercise 8
        System.out.print("Enter one grade: ");
        int grade = read.nextInt();
        
        while (grade <0 || grade >10) {
            System.out.println("The grade must be between 0 and 10");
            System.out.print("Please, enter it again: ");
            grade = read.nextInt();            
        }
        System.out.println("");
         //Excercise 9
         int numbers;
         int sums = 0;
         int cont = 0;
         
         do {            
             System.out.print("Enter a number:  ");
             numbers = read.nextInt();
             
             if (numbers > 0){
                 sums += numbers;
             } else if (numbers == 0){
                 System.out.println("The zero was captured!");
                 break;
             }             
             cont += 1;             
        } while (cont < 20);
         
         System.out.println("The sum of the numbers is: " + sums);
         
         System.out.println("");
         
         //Excercise 10
         int nums;
         
         for (int i = 0; i != 4; i++) {
             System.out.print("Ingrese un número:  ");
             nums = read.nextInt();
             
             System.out.print(nums);
             for (int j = 0; j != (nums); j++) {
                 System.out.print("*");                 
             }             
             System.out.println(" ");                     
        }  
    }
}
