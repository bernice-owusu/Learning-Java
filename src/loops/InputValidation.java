package loops;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        double ratePerHour = 15.0;
        double maxHours = 40.0;

        System.out.println("Enter the number of hours worked for the week: ");
        Scanner scanner = new Scanner(System.in);

        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("The number of hours worked cannot exceed 40. Please enter a valid number of hours: ");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double totalPay = hoursWorked * ratePerHour;
        System.out.println("The total pay for the week is : $" + totalPay);
    }
}
