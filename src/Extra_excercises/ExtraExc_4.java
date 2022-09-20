package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10:  ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("The equivalent in roman numbers is: I");
                break;
            case 2:
                System.out.println("The equivalent in roman numbers is: II");
                break;
            case 3:
                System.out.println("The equivalent in roman numbers is: III");
                break;
            case 4:
                System.out.println("The equivalent in roman numbers is: IV");
                break;
            case 5:
                System.out.println("The equivalent in roman numbers is: V");
                break;
            case 6:
                System.out.println("The equivalent in roman numbers is: VI");
                break;
            case 7:
                System.out.println("The equivalent in roman numbers is: VII");
                break;
            case 8:
                System.out.println("The equivalent in roman numbers is: VIII");
                break;
            case 9:
                System.out.println("The equivalent in roman numbers is: IX");
                break;
            case 10:
                System.out.println("The equivalent in roman numbers is: X");
                break;
            default:
                System.out.println("The number is not between 1 and 10.");

        }

    }

}
