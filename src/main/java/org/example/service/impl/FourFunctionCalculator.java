package org.example.service.impl;

import org.example.service.CalculatorService;

public class FourFunctionCalculator implements CalculatorService {
    @Override
    public double add(final double input1, final double input2) {
        return input1 + input2;
    }

    @Override
    public double subtract(final double input1, final double input2) {
        return input1 - input2;
    }

    @Override
    public double multiply(final double input1, final double input2) {
        return input1 * input2;
    }

    @Override
    public double divide(final double input1, final double input2) {
        if (input2 == 0D) {
            throw new ArithmeticException("cannot divide by zero");
        }

        return input1 / input2;
    }
}
