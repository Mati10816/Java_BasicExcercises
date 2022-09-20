package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;
        int quotient = 0;
        int rest;

        System.out.print("Enter the dividen:  ");
        int dividen = input.nextInt();

        System.out.print("Enter the divisor:  ");
        int divisor = input.nextInt();

        while (divisor > dividen) {
            System.out.println("The divisor must be lower than the dividen. Enter the number again.");
            System.out.print("Enter the dividen:  ");
            dividen = input.nextInt();
            System.out.print("Enter the divisor:  ");
            divisor = input.nextInt();
        }
        
        do {            
            result = dividen - divisor;
            quotient += 1;
            dividen = result;
            rest = result;
            
        } while (result >= divisor);
        
        System.out.println("The quotient is: " + quotient);
        System.out.println("The rest is: " + rest);

    }

}
