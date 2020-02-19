package org.example.service;

/**
 * A service for providing the basic four-function calculator.
 */
public interface CalculatorService {
    /**
     * Add two numbers together.
     *
     * @param addend1 The first number to add
     * @param addend2 The second number to add
     * @return A {@code double} representing the sum of {@code addend1} and {@code addend2}
     */
    double add(double addend1, double addend2);

    /**
     * Subtract one number from another.
     *
     * @param minuend The number being subtracted from
     * @param subtrahend the number to subtract from the minuend
     * @return A {@code double} representing the difference between the {@code minuend} and {@code subtrahend}
     */
    double subtract(double minuend, double subtrahend);

    /**
     * Multiply two numbers together.
     *
     * @param factor1 The first number to multiply
     * @param factor2 The second number to multiply
     * @return A {@code double} representing the product of {@code factor1} and {@code factor2}
     */
    double multiply(double factor1, double factor2);

    /**
     * Divide one number by another.
     *
     * @param dividend The number to divide
     * @param divisor The number to divide by
     * @return A {@code double} representing the quotient of dividing {@code dividend} by the {@code divisor}
     */
    double divide(double dividend, double divisor);
}
