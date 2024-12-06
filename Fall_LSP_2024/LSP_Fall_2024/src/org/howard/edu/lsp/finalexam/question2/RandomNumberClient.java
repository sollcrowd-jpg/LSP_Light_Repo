package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to demonstrate the usage of RandomNumberService.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        // Get the singleton service instance
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        service.setGenerator(new JavaRandomNumberGenerator());
        System.out.println("Using Java's Random: " + service.generateRandomNumber());

        // Use the custom random number generator
        service.setGenerator(new CustomRandomNumberGenerator());
        System.out.println("Using Custom Algorithm: " + service.generateRandomNumber());
    }
}
