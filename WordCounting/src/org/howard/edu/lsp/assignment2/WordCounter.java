package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	public static void main(String[] args) {
		String fileName = "words.text";
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split line into words, ignoring numbers and punctuation
                String[] words = line.toLowerCase().split("[^a-zA-Z]+");
                for (String word : words) {
                    if (!word.isEmpty() && !word.matches("\\d+")) {  // Ignore numbers
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Print the words and their counts
        wordCountMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
