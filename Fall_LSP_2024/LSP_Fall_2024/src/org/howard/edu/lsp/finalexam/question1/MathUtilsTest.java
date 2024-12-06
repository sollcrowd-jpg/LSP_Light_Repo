package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFactorial_nonNegativeInput() {
        MathUtils utils = new MathUtils();
        assertEquals(120, utils.factorial(5), "Factorial of 5 should be 120");
        assertEquals(1, utils.factorial(0), "Factorial of 0 should be 1");
        assertEquals(1, utils.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    public void testFactorial_negativeInput() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> utils.factorial(-5),
                "Factorial of a negative number should throw IllegalArgumentException");
    }

    @Test
    public void testFactorial_largeInput() {
        MathUtils utils = new MathUtils();
        assertEquals(3628800, utils.factorial(10), "Factorial of 10 should be 3628800");
    }

    @Test
    public void testIsPrime_primeNumbers() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(2), "2 should be a prime number");
        assertTrue(utils.isPrime(17), "17 should be a prime number");
        assertTrue(utils.isPrime(101), "101 should be a prime number");
    }

    @Test
    public void testIsPrime_nonPrimeNumbers() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(1), "1 is not a prime number");
        assertFalse(utils.isPrime(0), "0 is not a prime number");
        assertFalse(utils.isPrime(100), "100 is not a prime number");
    }

    @Test
    public void testIsPrime_edgeCases() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(-3), "-3 is not a prime number");
        assertFalse(utils.isPrime(-17), "-17 is not a prime number");
        assertTrue(utils.isPrime(3), "3 should be a prime number");
    }

    @Test
    public void testGCD_validInputs() {
        MathUtils utils = new MathUtils();
        assertEquals(6, utils.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, utils.gcd(17, 13), "GCD of 17 and 13 should be 1");
        assertEquals(10, utils.gcd(0, 10), "GCD of 0 and 10 should be 10");
    }

    @Test
    public void testGCD_zeroInputs() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> utils.gcd(0, 0),
                "GCD of 0 and 0 should throw IllegalArgumentException");
    }

    @Test
    public void testGCD_negativeInputs() {
        MathUtils utils = new MathUtils();
        assertEquals(7, utils.gcd(-14, 7), "GCD of -14 and 7 should be 7");
        assertEquals(12, utils.gcd(-36, -60), "GCD of -36 and -60 should be 12");
        assertEquals(1, utils.gcd(-17, 13), "GCD of -17 and 13 should be 1");
    }
}
