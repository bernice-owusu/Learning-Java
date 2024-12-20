package loops;

import java.util.Scanner;

// Write a cashier program that will
// scan a given number of items and tally the cost

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items you would like to scan: ");
        int quantity = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item: " + (i + 1));
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();
        System.out.println("The total cost is: $" + total);
    }
}
