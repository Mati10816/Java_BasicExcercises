package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int even = 0;
        int odd = 0;
        int total = 0;

        do {
            System.out.print("Enter the number:  ");
            number = input.nextInt();

            if (((number % 5) == 0) && number < 0) {
                System.out.print("Enter the number:  ");
                number = input.nextInt();
            }

            if (number > 0) {
                if ((number % 2) == 0) {
                    even += 1;
                } else if ((number % 3) == 0) {
                    odd += 1;
                }
                total += 1;
            }

        } while (((number % 5) != 0));

        System.out.println("The even numbers entered were: " + even);
        System.out.println("The odd numbers entered were: " + odd);
        System.out.println("The total numbers entered were: " + total);
    }

}
