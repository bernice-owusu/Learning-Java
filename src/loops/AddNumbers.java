package loops;

import java.util.Scanner;

// Write a program that allows a user to enter two numbers, and then sums up
// the two numbers. The user should be able to repeat this action until they
// indicate they are done.

public class AddNumbers {
    public static void main(String[] args) {
        boolean again = true;

        Scanner scanner = new Scanner(System.in);
        // do {

        // System.out.println("Enter the first number: ");
        // double firstNumber = scanner.nextDouble();

        // System.out.println("Enter the second number: ");
        // double secondNumber = scanner.nextDouble();

        // double sum = firstNumber + secondNumber;
        // System.out.println("The sum of " + firstNumber + " and " + secondNumber + "
        // is " + sum);

        // System.out.println("Do you want to continue? (true/false)");
        // again = scanner.nextBoolean();

        // } while (again);

        while (again) {
            System.out.println("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

            System.out.println("Do you want to continue? (true/false)");
            again = scanner.nextBoolean();

        }
        scanner.close();
    }
}
