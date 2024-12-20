package decision_structure;

import java.util.Scanner;

// Have a user enter their letter grade,and using a switch expression, 
// print out a message letting them know how they did

public class GradeMessage_switch_expression {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();

        scanner.close();

        String gradeMessage = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You passed!";
            case "E", "F" -> "You failed!";
            default -> "Invalid grade";
        };

        System.out.println(gradeMessage);

    }

}
