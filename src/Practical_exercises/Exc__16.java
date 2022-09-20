package Practical_exercises;


import java.util.Scanner;

public class Exc__16 {

    public static void fillVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int num = (int) (Math.random() * 100);
            vector[i] = num;
        }
    }

    public static void searchNum(int[] vector, int num) {
        int apperence = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("The number is in the position: " + i);
                apperence += 1;
            }
        }

        if (apperence > 1) {
            System.out.println("\nAs you can see, the number it´s repeated.");
        } else if (apperence == 0) {
            System.out.println("\nThe number didn´t appear.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the vector:  ");
        int size = input.nextInt();

        int[] vector = new int[size];
        fillVector(vector);

        System.out.print("Enter the number you are looking for:  ");
        int numSearched = input.nextInt();

        searchNum(vector, numSearched);

    }

}
