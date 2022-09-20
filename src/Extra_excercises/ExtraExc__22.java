package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__22 {

    public static void fillingMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] =(int) (Math.random() * 10+1);
            }
        }
    }

    public static int sums(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int m = input.nextInt();

        int[][] matrix = new int[n][m];
        int total;

        fillingMatrix(matrix);
        total = sums(matrix);

        System.out.println("\n---> The sum of the numbers is: " + total);

    }

}
