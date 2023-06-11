import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayWordsCapatialized {
    public static List<String> capitalizeWords(List<String> words) {
        List<String> capitalizedWords = new ArrayList<>();

        if (words.isEmpty()) {
            return capitalizedWords;
        }

        String firstWord = words.get(0);
        capitalizedWords.add(firstWord.toUpperCase());

        List<String> remainingWords = words.subList(1, words.size());
        capitalizedWords.addAll(capitalizeWords(remainingWords));

        return capitalizedWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        List<String> wordsList = new ArrayList<>();

        System.out.println("Enter the words:");

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            wordsList.add(word);
        }

        List<String> result = capitalizeWords(wordsList);
        System.out.println("Capitalized words: " + result);
        scanner.close();
    }
}
