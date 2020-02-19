package org.example;

import org.example.service.CalculatorService;

/**
 * A basic math application that exercises an implementation of the {@link org.example.service.CalculatorService}.
 */
public class MathApplication {
    private final CalculatorService calculatorService;

    public MathApplication(final CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double add(final double input1, final double input2) {
        return calculatorService.add(input1, input2);
    }

    public double subtract(final double input1, final double input2) {
        return calculatorService.subtract(input1, input2);
    }

    public double multiply(final double input1, final double input2) {
        return calculatorService.multiply(input1, input2);
    }

    public double divide(final double input1, final double input2) {
        return calculatorService.divide(input1, input2);
    }
}
