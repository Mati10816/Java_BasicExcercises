package Extra_excercises;

public class ExtraExc__19 {

    public static void fillingVectors(int[] vector1, int[] vector2) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 10 + 1);
            vector2[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static boolean compareVectors(int[] vector1, int[] vector2) {
        boolean equalsVectors = true;

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                equalsVectors = false;
                break;
            }
        }
        return equalsVectors;
    }

    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];

        boolean result;

        fillingVectors(vector1, vector2);
        result = compareVectors(vector1, vector2);

        if (result) {
            System.out.println("The 2 vectors are equal.");
        } else {
            System.out.println("The 2 vectors are different.");
        }
    }

}
