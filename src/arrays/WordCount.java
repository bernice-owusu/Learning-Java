package arrays;

// Write a method that counts the number of words in a String and
// prints them individually on new lines

public class WordCount {
    static String sentence = "I am a test sentence";

    public static void main(String[] args) {

        String[] wordsBreakdown = wordsBreakGenerator(sentence);
        printStrings(wordsBreakdown);

    }

    public static String[] wordsBreakGenerator(String sentence) {
        String[] wordsBreakdown = sentence.split(" ");
        System.out.println("Number of words: " + wordsBreakdown.length);
        return wordsBreakdown;
    }

    public static void printStrings(String[] wordInString) {
        for (String val : wordInString) {
            System.out.println(val);
        }
    }
}
