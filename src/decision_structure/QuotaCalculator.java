package decision_structure;

import java.util.Scanner;

// All salespeople are expected to make at least 10 sales each week.
// For those who do, they receive a congratulatory message. 
// For those who don’t, they are informed of how many sales they were short

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        String message = "";

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesMade = scanner.nextInt();
        scanner.close();

        if (salesMade >= quota) {
            message = "Congratulations! You've met your quota";
            System.out.println(message);
        } else {
            int salesShort = quota - salesMade;
            message = "You did not meet your quota. You were " + salesShort + " sales short";
            System.out.println(message);
        }

    }
}
