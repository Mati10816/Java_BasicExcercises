package Extra_excercises;

import java.util.Scanner;

public class ExtraExc__16 {

    public static void fillingData(int cantPeople) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        String option;

        for (int i = 0; i < cantPeople; i++) {
            System.out.print("\nEnter the name of the person " + (i + 1) + ":  ");
            name = input.nextLine();
            System.out.print("Enter the age: ");
            age = input.nextInt();

            System.out.println();
            if (age >= 18) {
                System.out.println(name + " is " + age + " years old and is of legal age.");
            } else {
                System.out.println(name + " is " + age + " years old and still underage...");
            }

            if (i != (cantPeople - 1)) {
                input.nextLine();
                System.out.print("What do you want to do? Enter Yes to continue or No to finish the program --->  ");
                option = input.nextLine();

                if ("No".equalsIgnoreCase(option)) {
                    break;
                }
            } else{
                System.out.println("\nYou finish the data filling.");
            }
        }
        System.out.println("\n\t*** Thank you for using our program ***");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people:  ");
        int people = input.nextInt();

        fillingData(people);
    }

}
