package Practical_exercises;

public class Exc__18 {

    public static void matrixFilling(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = (int) (Math.random() * 10);
                matrix[i][j] = num;
            }
        }
    }
    
    public static void showMatrix(int [][] matrix){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {                
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    public static void showTransposedMatrix(int [][] matrix){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {                
                System.out.print("[" + matrix[j][i] + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        
        matrixFilling(matrix);
        showMatrix(matrix);
        System.out.println();
        showTransposedMatrix(matrix);

    }

}
