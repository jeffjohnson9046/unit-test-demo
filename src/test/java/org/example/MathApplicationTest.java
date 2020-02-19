package org.example;

import org.example.service.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

    @Mock
    CalculatorService calculatorService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    public void shouldAddTwoNumbers() {
        when(calculatorService.add(10D, 20D))
                .thenReturn(30D);

        assertEquals(30D, mathApplication.add(10D, 20D), 0D);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        when(calculatorService.subtract(10D, 20D))
                .thenReturn(-10D);

        assertEquals(-10D, mathApplication.subtract(10D, 20D), 0D);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        when(calculatorService.multiply(10D, 20D))
                .thenReturn(200D);

        assertEquals(200D, mathApplication.multiply(10D, 20D), 0D);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        when(calculatorService.divide(10D, 20D))
                .thenReturn(0.5D);

        assertEquals(0.5D, mathApplication.divide(10D, 20D), 0D);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingByZero() {
        when(calculatorService.divide(10D, 0D))
                .thenThrow(new ArithmeticException("cannot divide by zero"));

        mathApplication.divide(10D, 0D);
    }
}