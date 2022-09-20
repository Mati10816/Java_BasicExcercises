package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__18 {

    public static void chargingNumbers(float[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + " number:  ");
            numbers[i] = input.nextFloat();
        }
    }

    public static float addingNumbers(float[] numbers) {
        float totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many number you are going to charge? --->  ");
        int quant = input.nextInt();

        float [] numbers = new float[quant];
        float total;

        chargingNumbers(numbers);
        total = addingNumbers(numbers);
        
        Math.round(total);
        
        System.out.println("\nThe sum of the numbers is: " + total );

    }

}
