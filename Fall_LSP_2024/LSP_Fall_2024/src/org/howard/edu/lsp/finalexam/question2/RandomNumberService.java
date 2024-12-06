package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using the Strategy pattern.
 */
public class RandomNumberService {
    private static RandomNumberService instance; // Singleton instance
    private RandomNumberGenerator generator; // Strategy

    // Private constructor to prevent instantiation
    private RandomNumberService() {}

    /**
     * Gets the singleton instance of RandomNumberService.
     * 
     * @return the singleton instance
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     * 
     * @param generator the RandomNumberGenerator strategy to use
     */
    public void setGenerator(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    /**
     * Generates a random number using the selected strategy.
     * 
     * @return a random positive integer
     */
    public int generateRandomNumber() {
        if (generator == null) {
            throw new IllegalStateException("RandomNumberGenerator strategy is not set.");
        }
        return generator.generate();
    }
}

