package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.next();
        scanner.close();
        greetUser(username);

    }

    public static void greetUser(String username) {
        System.out.println("Hello, " + username + "!");
    }
}
