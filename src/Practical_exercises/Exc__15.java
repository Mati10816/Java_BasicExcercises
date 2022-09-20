
package Practical_exercises;


public class Exc__15 {

    public static void fillVector(int[] vector) {

        for (int i = 0; i < 100; i++) {
            vector[i] = (i + 1);
        }
    }

    public static void showVector(int[] vector) {
        for (int i = 99; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }

        System.out.println(" ");
    }

    public static void main(String[] args) {

        int[] vector = new int[100];

        fillVector(vector);
        showVector(vector);

    }
}
