package Week2.Day4;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String paragraph = "Java is great. Java is fast! Learning Java is a great experience.";
        String cleanedText = paragraph.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] words = cleanedText.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("--- Word Frequencies ---");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
