package methods;

import java.util.Scanner;

// Write a method that asks a user for their name, 
// then another method that greets the user by name.

public class GreetUser {
    public static void main(String[] args) {
        String username = askName();
        greetUser(username);

    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.next();
        scanner.close();
        return username;
    }

    public static void greetUser(String username) {
        System.out.println("Hello, " + username + "!");
    }
}
