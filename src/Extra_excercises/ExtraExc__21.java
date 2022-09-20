package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__21 {

    public static void fillingNotes(float[][] matrix) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\n*** For the student***" + (i + 1));
            for (int j = 0; j < matrix[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Enter the note for the first practical work: ");
                        matrix[i][j] = input.nextFloat();
                        break;
                    case 1:
                        System.out.print("Enter the note for the second practical work: ");
                        matrix[i][j] = input.nextFloat();
                        break;
                    case 2:
                        System.out.print("Enter the note for the first integrator: ");
                        matrix[i][j] = input.nextFloat();
                        break;
                    case 3:
                        System.out.print("Enter the note for the second integrator: ");
                        matrix[i][j] = input.nextFloat();
                        break;
                }
            }
        }
    }

    public static void averages(float[][] matrix, float[] studentAverages) {
        float sum = 0;
        float average;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            average = sum / 4;
            studentAverages[i] = average;
            sum = 0;
        }
    }

    public static int[] approvedStudents(float[] studentAverages) {
        int[] approved = new int[2];
        approved[0] = 0;
        approved[1] = 0;

        for (int i = 0; i < studentAverages.length; i++) {
            if (studentAverages[i] >= 7) {
                approved[0] += 1;
            } else {
                approved[1] += 1;
            }
        }
        return approved;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Rows are the students and Columns are the notes
        float[][] students = new float[10][4];
        float[] studentsAverages = new float[10];
        int [] results;
        
        fillingNotes(students);
        averages(students, studentsAverages);
        results = approvedStudents(studentsAverages);
        
        System.out.println("\n---> The number of approved students is:  " + results[0]);
        System.out.println("---> The number of failed students are:  " + results[1]);
       

    }

}
