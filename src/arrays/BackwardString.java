package arrays;

// Write a method that prints a given String backwards. For example, 
// if given “pots”, it prints “stop”.
public class BackwardString {
    static String word = "pots";

    public static void main(String[] args) {
        reverseWord(word);
    }

    public static void reverseWord(String word) {
        String finalReversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            finalReversed += word.charAt(i);
        }
        System.out.println(finalReversed);

    }

}
