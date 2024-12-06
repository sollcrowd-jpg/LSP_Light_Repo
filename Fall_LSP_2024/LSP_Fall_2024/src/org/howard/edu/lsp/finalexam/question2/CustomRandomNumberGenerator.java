package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom implementation of RandomNumberGenerator using a simple linear congruential generator.
 */
public class CustomRandomNumberGenerator implements RandomNumberGenerator {
    private long seed = System.currentTimeMillis();

    @Override
    public int generate() {
        seed = (seed * 1103515245 + 12345) & 0x7FFFFFFF; // Linear congruential algorithm
        return (int) (seed % Integer.MAX_VALUE) + 1; // Ensure the number is positive
    }
}
