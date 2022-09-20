package Practical_exercises;

import java.util.Scanner;

public class Exc__19 {

    public static void matrixFilling(int[][] matrix, int size) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter a number: ");
                int num = input.nextInt();
                matrix[i][j] = num;
            }
        }
    }

    public static void showMatrix(int[][] matrix, int size) {
        System.out.println("\nThe original Matix is: ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[ " + matrix[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public static void showTransposedMatrix(int[][] matrix, int size) {
        System.out.println("\nThe transposed Matix is: ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[ " + matrix[j][i] + " ]");
            }
            System.out.println();
        }
    }

    public static void antiSimetricMatrix(int[][] matrix, int size) {
        boolean isAntiSimetric = true;        

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((matrix[i][j] * -1) != (matrix[j][i])) {
                    isAntiSimetric = false;
                }
            }
        }

        if (isAntiSimetric) {
            System.out.println("\nThe original matrix is anti simetric to his transposed matrix.");
        } else {
            System.out.println("\nThe original matrix is NOT anti simetric to his transposed matrix.");
        }
    }

    public static void main(String[] args) {

        int size = 3;
        int[][] matrix = new int[size][size];

        matrixFilling(matrix, size);
        showMatrix(matrix, size);
        showTransposedMatrix(matrix, size);
        antiSimetricMatrix(matrix, size);

    }

}
