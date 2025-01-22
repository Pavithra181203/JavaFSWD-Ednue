import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);

        System.out.println("Reversed words: ");
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println(reversedWord);
        }
        scanner.close();
    }
}

