package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of steps:  ");
        int steps = input.nextInt();
        int counter = 1;

        do {
            for (int i = 1; i < counter; i++) {
                System.out.print(i);
            }
            
            System.out.println();
            counter += 1;
        } while (counter <= steps + 1);

    }

}
