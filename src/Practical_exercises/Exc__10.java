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
public class Exc__10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String exit = " ";
        System.out.print("Are you sure you want to leave the program? (Y/N):  ");
        exit = read.nextLine();
        //System.out.println(" ");

        if (!"Y".equals(exit)) {
            System.out.println("\nMENU");
            System.out.println("1. Sum  \n2. Substract  \n3. Multiply  \n4. Divide  \n5. Exit  \n*Choose an option*");

        }

        System.out.print("Enter the upper limit (an integer number)");
        int top = read.nextInt();

        int sum = 0;

        while (sum <= top) {
            System.out.print("Enter one integer number:  ");
            int num = read.nextInt();

            sum += num;
        }
    }
}
