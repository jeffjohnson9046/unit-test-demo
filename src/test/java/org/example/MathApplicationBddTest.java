package org.example;

import org.example.service.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationBddTest {

    @Mock
    CalculatorService calculatorService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    public void shouldAddTwoNumbers() {
        given(calculatorService.add(10D, 20D))
                .willReturn(30D);

        final double result = mathApplication.add(10D, 20D);

        assertEquals(30D, result ,0D);
    }
}
