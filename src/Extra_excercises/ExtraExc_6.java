package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_6 {

    public static float[] heights(int people) {
        Scanner input = new Scanner(System.in);
        float[] heights = new float[people];

        System.out.println("Next, enter the heights");
        for (int i = 0; i < people; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            heights[i] = input.nextFloat();

        }

        return heights;
    }

    public static float generalAverage(float[] heights) {
        float average;
        float sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        average = (sum / (heights.length));

        return average;
    }

    public static float specificAverage(float[] heights) {
        float average = 0;
        float sum = 0;
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < 1.6) {
                sum += heights[i];
                count += 1;
            }

        }
        if (count != 0) {
            average = (sum / (count));
        }

        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int people = input.nextInt();
        float[] heights = new float[people];
        float average;
        float specificAverage;

        heights = heights(people);
        average = generalAverage(heights);

        specificAverage = specificAverage(heights);

        System.out.println();
        System.out.println("The general average is: " + average);

        if (specificAverage != 0) {
            System.out.println("The average of heigths below 1,60 mts is: " + specificAverage);

        } else {
            System.out.println("There is no heigths below 1,60 mts");
        }

    }

}
