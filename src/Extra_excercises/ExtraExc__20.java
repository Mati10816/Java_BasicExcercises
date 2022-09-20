package Extra_excercises;

public class ExtraExc__20 {

    public static void fillingVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void showVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[5];

        fillingVector(vector);
        showVector(vector);
        System.out.println();
    }

}
