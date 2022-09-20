package Extra_excercises;

public class ExtraExc_2 {

    public static void main(String[] args) {
        int A = 4;
        int B = 55;
        int C = 666;
        int D = 7777;

        System.out.println("A: " + A + " / B: " + B + " / C: " + C + " / D: " + D);
        int aux;
        aux = D;
        D = B;
        B = C;
        C = A;
        A = aux;

        System.out.println(" ");
        System.out.println("A: " + A + " / B: " + B + " / C: " + C + " / D: " + D);

    }

}
