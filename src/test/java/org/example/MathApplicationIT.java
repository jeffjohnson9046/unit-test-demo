package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationIT {

    @Test
    public void shouldNotRunFromSurefire() {
        assertTrue(true);
    }
}
