package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    // HashMap to store candidates and their vote counts
    private Map<String, Integer> candidates;

    // Constructor
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // Method to add a candidate
    public void addCandidate(String name) {
        // Only add the candidate if they are not already in the list
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Initialize vote count to 0
        }
    }

    // Method to cast a vote to a candidate
    public void castVote(String name) {
        // If candidate exists, increment their vote count
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate " + name + " not found!");
        }
    }

    // Method to print candidates and vote counts
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append("Candidate: ").append(entry.getKey()).append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}