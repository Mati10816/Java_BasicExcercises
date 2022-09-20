package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);

        int multiplication = (num1 * num2);

        System.out.print("Guess the product of the secret numbers:  ");
        int result = input.nextInt();

        while (result != multiplication) {
            System.out.print("Wrong, try to guess again:  ");
            result = input.nextInt();
        }

        System.out.println("Great! you guess the result.");

    }

}
