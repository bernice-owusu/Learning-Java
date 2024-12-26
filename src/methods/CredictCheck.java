package methods;

import java.util.Scanner;

// Write a program that approves anyone who makes more than
// $5,000 and has a credit score of 700 or better. Reject all others

public class CredictCheck {

    static int requiredCreditScore = 700;
    static double requiredMonthlyIncome = 5000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double monthlyIncome = getUserSalary();

        int creditScore = getUserCreditScore();

        scanner.close();

        boolean isEligible = checkEligibility(monthlyIncome, creditScore);
        notifyUser(isEligible);
    }

    public static double getUserSalary() {
        System.out.println("How much money do you earn monthly?");
        double monthlyIncome = scanner.nextDouble();
        return monthlyIncome;
    }

    public static int getUserCreditScore() {
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean checkEligibility(double monthlyIncome, int creditScore) {
        if (monthlyIncome >= requiredMonthlyIncome && creditScore >= requiredCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isEligible) {
        if (isEligible) {
            System.out.println("Congratulations! You are eligible for the loan.");
        } else {
            System.out.println("Sorry, you are not eligible for the loan.");
        }
    }
}
