package Extra_excercises;

public class ExtraExc__12 {

    public static void main(String[] args) {

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        System.out.println(count1 + " - " + count2 + " - " + count3);

        while (count1 < 9 && count2 < 9 && count3 < 9) {
            count1 += 1;
            count2 += 1;
            count3 += 1;

            if (count1 == 3 || count2 == 3 || count3 == 3) {
                String numStr = String.valueOf(count1);
                numStr = "E";

                System.out.println(numStr + " - " + numStr + " - " + numStr);
            } else {
                System.out.println(count1 + " - " + count2 + " - " + count3);

            }

        }

    }

}
