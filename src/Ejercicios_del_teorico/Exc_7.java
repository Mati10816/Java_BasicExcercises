/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_del_teorico;
import java.util.Scanner;

/**
 *
 * @author Matias Fernandez
 */
public class Exc_7 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter an option between 1 and 4 to know about the motors:  ");
        int typeMotor = read.nextInt();
        
        switch (typeMotor) {
            case 1:
                System.out.println("The pump is a water pump");
                break;
            case 2:
                System.out.println("The pump is a gas pump");
                break;
            case 3:
                System.out.println("The pump is a concrete pump");
                break;
            case 4:
                System.out.println("The pump is a food pasta pump.");
                break;
            default:
                System.out.println("The option is not a valid value for pump type");          
                        
        }
    }
}
