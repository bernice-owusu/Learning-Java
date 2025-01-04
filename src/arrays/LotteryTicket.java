package arrays;

// Create a Lottery Quick Pick application that will generate a
// lottery ticket with 6 random numbers between 1-69.

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_NUMBER = 69;

    public static void main(String[] args) {
        int ticket[] = generateNumbers();
        printTickets(ticket);

    }

    public static int[] generateNumbers() {
        Random random = new Random();
        int[] randomNumbers = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(1, MAX_NUMBER);
            } while (search(randomNumbers, randomNumber));
            randomNumbers[i] = randomNumber;
        }
        return randomNumbers;
    }

    public static boolean search(int[] arr, int searchNumber) {
        for (int val : arr) {
            if (val == searchNumber)
                return true;
        }
        return false;
    }

    public static void printTickets(int arr[]) {
        Arrays.sort(arr);
        for (int val : arr) {
            System.out.print(val + " | ");
        }
    }
}
