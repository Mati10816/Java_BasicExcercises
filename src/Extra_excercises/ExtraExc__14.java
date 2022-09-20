package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many families will you charge? --->  ");
        int families = input.nextInt();
        float sons;
        float age;
        float totalAges = 0;
        float totalSons = 0;
        float ageAverage;

        for (int i = 0; i < families; i++) {
            System.out.print("How many sons have the family " + (i + 1) + "? --->  ");
            sons = input.nextInt();
            totalSons += sons;

            for (int j = 0; j < sons; j++) {
                System.out.print("Enter the age for the " + (j + 1) + " son:  ");
                age = input.nextInt();
                totalAges += age;
            }
        }

        ageAverage = totalAges / totalSons;

        System.out.println("The average age of the total number of children in all the families is: " + ageAverage);

    }

}
