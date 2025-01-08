package arrays;

// Write a method that counts the number of words in a String and
// prints them individually on new lines

public class WordCount {
    static String sentence = "I am a test sentence";

    public static void main(String[] args) {
        wordsBreakGenerator(sentence);
    }

    public static void wordsBreakGenerator(String sentence) {
        String[] wordsBreakdown = sentence.split(" ");
        System.out.println("Number of words: " + wordsBreakdown.length);
        for (String val : wordsBreakdown) {
            System.out.println(val);
        }
    }

}
