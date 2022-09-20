package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter:  ");
        String letter = input.nextLine();

        if (((("a".equalsIgnoreCase(letter) || "e".equalsIgnoreCase(letter)) || "i".equalsIgnoreCase(letter)) || "o".equalsIgnoreCase(letter)) || "u".equalsIgnoreCase(letter)) {
            System.out.println("The entered letter is a vowel.");

        } else {
            System.out.println("The letter is a consonant.");

        }

    }

}
