package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the letter of the partner: ");
        String partner = input.next();

        System.out.print("Enter the cost of treatment:  ");
        float cost = input.nextInt();

        int payment;

        switch (partner) {
            case "A":
                payment = (int) (float) (cost - (cost * 0.5));
                System.out.println("You´ve a 50% of discount; the final cost of the treatment is: " + payment);
                break;
            case "B":
                payment = (int) (float) (cost - (cost * 0.35));
                System.out.println("You´ve a 35% of discount; the final cost of the treatment is: " + payment);
                break;
            case "C":
                System.out.println("The final cost of the treatment is: " + cost);
                break;
            default:
                System.out.println("The partner entered isn´t correct.");
        }
    }

}
