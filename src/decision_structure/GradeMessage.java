package decision_structure;

import java.util.Scanner;

// Have a user enter their letter grade, and using a switch statement,
// print out a message letting them know how they did.

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        grade = Character.toUpperCase(grade);

        String gradeMessage = "";

        scanner.close();

        switch (grade) {
            case 'A':
                gradeMessage = "Excellent job!";
                break;
            case 'B':
                gradeMessage = "Great job!";
                break;
            case 'C':
                gradeMessage = "Good job!";
                break;
            case 'D':
                gradeMessage = "You passed!";
                break;
            case 'E':
            case 'F':
                gradeMessage = "You failed!";
                break;

            default:
                gradeMessage = "Invalid grade";
                break;
        }

        System.out.println(gradeMessage);

    }
}
