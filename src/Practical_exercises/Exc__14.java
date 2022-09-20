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
public class Exc__14 {

    public static void change(float amount, String currency ) {
        
        switch (currency ){
            case "Dollar":
                System.out.println("The equivalent in Dollars is: " + (amount * 1.28611));
                break;
            case "Yen":
                System.out.println("The equivalent Yens is: " + (amount * 129.852));
                break;
            case "Pound":
                System.out.println("The equivalent Pounds is: " + (amount * 0.86));
                break;
                
                default:
                    System.out.println("The currency type entered was wrong.");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of Euros:  ");
        float euros = input.nextFloat();
        
        input.nextLine();
        
        System.out.print("Write the currency type you want to convert (Dollar, Yen or Pound):  ");
        String currency  = input.nextLine();
        
        change(euros, currency );
    }

}
