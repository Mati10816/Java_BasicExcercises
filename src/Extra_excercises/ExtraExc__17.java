package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__17 {

    public static boolean primeVerification(int number) {
        boolean isPrime = false;

        if (((number % 2) != 0 && (number % 3) != 0) || (number == 2) || (number == 3)) {
            isPrime = true;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = input.nextInt();

        boolean result = primeVerification(num);

        if (result) {
            System.out.println("\nThe number is prime.");
        } else {
            System.out.println("\nThe number isn't prime.");
        }

    }

}
