package decision_structure;

import java.util.Scanner;

// All salespeople get a payment of $1000 for the week.
// Salespeople who exceed 10 sales get an additional bonus of $250

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();

        scanner.close();

        if (sales >= quota) {
            salary = salary + bonus;
        }
        System.out.println("Your payment for this week is $" + salary);
    }
}