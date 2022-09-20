/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical_exercises;

/**
 *
 * @author Hogar
 */
public class Exc__21 {

    public static void matrixFilling(int[][] matrix) {
        int num;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                num = (int) (Math.random() * 10);
                matrix[i][j] = num;
            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int[][] matrixMain = new int[10][10];
        int[][] matrixNew = new int[3][3];

        matrixFilling(matrixMain);
        matrixFilling(matrixNew);
        
        

    }
}
