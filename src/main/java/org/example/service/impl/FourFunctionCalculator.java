package org.example.service.impl;

import org.example.service.CalculatorService;

public class FourFunctionCalculator implements CalculatorService {
    @Override
    public double add(final double addend1, final double addend2) {
        return addend1 + addend2;
    }

    @Override
    public double subtract(final double minuend, final double subtrahend) {
        return minuend - subtrahend;
    }

    @Override
    public double multiply(final double factor1, final double factor2) {
        return factor1 * factor2;
    }

    @Override
    public double divide(final double dividend, final double divisor) {
        if (divisor == 0D) {
            throw new ArithmeticException("cannot divide by zero");
        }

        return dividend / divisor;
    }
}
