package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__15 {

    public static float operations(float num1, float num2) {
        Scanner input = new Scanner(System.in);
        float result = 0;

        System.out.println("Whit the numbers you can:");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.print("Enter the number of the option --->   ");
        int option = input.nextInt();

        while (option < 1 || option > 4) {
            System.out.println("The option is incorrect");
            System.out.print("Enter the number of the option again --->   ");
            option = input.nextInt();
        }

        switch (option) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
        }
        
        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:  ");
        float num1 = input.nextInt();

        System.out.print("Enter the second number:  ");
        float num2 = input.nextInt();
        
        float result = operations(num1, num2);
        
        System.out.println("The result of the operation is: " + result);

    }

}
