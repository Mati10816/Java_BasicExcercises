package Extra_excercises;

import java.util.Scanner;

public class ExtraExc_7 {

    public static float[] numbersWhitWhile(int quantity) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float[quantity];
        int counter = 0;
        while (counter != quantity) {
            System.out.print("Enter the number " + (counter + 1) + ":  ");
            numbers[counter] = input.nextFloat();
            while (numbers[counter] < 1) {                
                System.out.print("The number must be greater than zero; please enter it again:  ");
                numbers[counter] = input.nextFloat();                
            }
            counter += 1;
        }
        return numbers;
    }

    public static float[] numbersWhitDoWhile(int quantity) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float[quantity];
        int counter = 0;
        do {
            System.out.print("Enter the number " + (counter + 1) + ":  ");
            numbers[counter] = input.nextFloat();
            while (numbers[counter] < 1) {                
                System.out.print("The number must be greater than zero; please enter it again:  ");
                numbers[counter] = input.nextFloat();                
            }
            counter += 1;
        } while (counter != quantity);

        return numbers;
    }

    public static float average(float[] numbers, int quantity) {
        float sum = 0;
        float average;

        for (int i = 0; i < quantity; i++) {
            sum += numbers[i];
        }

        average = sum / quantity;
        return average;
    }

    public static float maxNum(float[] numbers, int quantity) {
        float max = 0;
        for (int i = 0; i < quantity; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static float minNum(float[] numbers, int quantity) {
        float min = 0;
        boolean firstTime = true;

        for (int i = 0; i < quantity; i++) {
            if ((numbers[i] < min) || firstTime) {
                min = numbers[i];
                firstTime = false;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of numbers that you want to enter:  ");
        int quantity = input.nextInt();
        float[] numbers;
        float average;
        float maxNum;
        float minNum;

        //numbers = numbersWhitWhile(quantity);
        numbers = numbersWhitDoWhile(quantity);        

        average = average(numbers, quantity);
        maxNum = maxNum(numbers, quantity);
        minNum = minNum(numbers, quantity);
        
        System.out.println("The average of the numbers is: " + average);
        System.out.println("The highest number is: " + maxNum);
        System.out.println("The lower number is: " + minNum);

    }

}
