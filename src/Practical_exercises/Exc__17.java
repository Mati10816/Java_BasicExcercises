package Practical_exercises;

import java.util.Scanner;

public class Exc__17 {

    public static void fillVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            int num = (int) (Math.random() * 10000);
            System.out.println("*** " + num);
            vector[i] = num;
        }
    }

    public static int[] quantNumsDigits(int[] vector) {
        int[] digitsNums = new int[5];
        String numCadena;
        int lenNum;

        for (int i = 0; i < vector.length; i++) {
            numCadena = String.valueOf(vector[i]);
            lenNum = numCadena.length();

            switch (lenNum) {
                case 1:
                    digitsNums[0] += 1;
                    break;
                case 2:
                    digitsNums[1] += 1;
                    break;
                case 3:
                    digitsNums[2] += 1;
                    break;
                case 4:
                    digitsNums[3] += 1;
                    break;
                case 5:
                    digitsNums[4] += 1;
                    break;
                default:
                    break;
            }

        }

        return digitsNums;
    }

    public static void showVect(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                System.out.println("There is " + vector[i] + " numbers whit " + (i + 1) + " digit.");
            } else {
                System.out.println("There is " + vector[i] + " numbers whit " + (i + 1) + " digits.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the vector:  ");
        int size = input.nextInt();

        int[] vector = new int[size];
        fillVector(vector);

        int[] vectNumsDigits;

        vectNumsDigits = quantNumsDigits(vector);

        showVect(vectNumsDigits);
    }

}
