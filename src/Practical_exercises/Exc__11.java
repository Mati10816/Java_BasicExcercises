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
public class Exc__11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the first integer number:  ");
        int numOne = read.nextInt();

        System.out.print("Enter the second integer number:  ");
        int numTwo = read.nextInt();

        System.out.println("\nMENU");
        System.out.print("1. Sum  \n2. Substract  \n3. Multiply  \n4. Divide  \n5. Exit");
        
        int option;
        String exit = "N";

        do {
            System.out.print("\n*Choose an option -->  ");
            option = read.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("The sum is: " + (numOne + numTwo));                    
                    break;

                case 2:
                    System.out.println("The subtraction is: " + (numOne - numTwo));                    
                    break;

                case 3:
                    System.out.println("The multiplication is: " + (numOne * numTwo));                 
                    break;

                case 4:
                    System.out.println("The division is: " + (numOne / numTwo));                    
                    break;

                case 5:               
                    read.nextLine(); //This is really IMPORTANT, because if not, the var -exit- will not be readed
                    System.out.print("\nAre you sure you want to leave the program? (Y/N):  ");
                    exit = read.nextLine();
                    System.out.println("***** " + exit);

                    if (!"Y".equals(exit)) {
                        System.out.println("\nMENU");
                        System.out.println("1. Sum  \n2. Substract  \n3. Multiply  \n4. Divide  \n5. Exit");                        
                    } else {
                        exit = "Y";
                    }                    
                    break;

                default:
                    System.out.println("The option isn´t correct");                    
            }

        } while (!"Y".equals(exit));
        
        System.out.println("\nThank you for using our program\n");
    }
}
