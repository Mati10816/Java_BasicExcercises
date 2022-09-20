package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ant integer number:  ");
        float num = input.nextFloat();
        float result;
        int digits = 0;

        do {
            result = num / 10;
            digits += 1;
            num = result;

        } while (result > 1);

        System.out.println("\nThe number have " + digits + " digits.");
    }

}
