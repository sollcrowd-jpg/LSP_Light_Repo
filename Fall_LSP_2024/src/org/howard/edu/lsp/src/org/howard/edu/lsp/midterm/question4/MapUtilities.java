package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
    
    // Static method to find the number of common key-value pairs
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Check if either map is empty, return 0
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0; // Counter for common key-value pairs

        // Iterate through map1 entries
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++; // Increment count if both key and value match
            }
        }

        return count;
    }
}