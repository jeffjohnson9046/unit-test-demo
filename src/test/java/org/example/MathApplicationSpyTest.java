package org.example;

import org.example.service.impl.FourFunctionCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationSpyTest {

    @Spy
    FourFunctionCalculator calculatorService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    public void shouldDivideTwoNumbers() {
        final double result = mathApplication.divide(20D, 10D);

        assertEquals(2D, result, 0D);
    }
}
