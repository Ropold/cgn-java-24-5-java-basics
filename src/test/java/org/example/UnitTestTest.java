package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTestTest {
    @Test
    void return8_whenAdditionWith5And3() {
        int a = 5;
        int b = 3;

        int sum = UnitTest.addition(a, b);

        int expected = 8;
        assertEquals(expected, sum);
    }
    @Test
    void testIfEven() {
        int a = 4;

        boolean result = UnitTest.isEven(a);

        assertTrue(result);
    }

    @Test
    void testIfNumber1MultiNumber2() {
        int a = 5;
        int b = 3;

        int result = UnitTest.multi(a, b);

        assertEquals(a * b, result);
    }

    @Test
    void testIfStringIsUpperCase() {
        String input = "hello";

        String result = UnitTest.upperCase(input);

        assertEquals("HELLO", result);
    }

    @Test
    void testIfNumberIsPositive() {
        int a = 10;

        boolean result = UnitTest.isPositive(a);

        assertTrue(result);
    }

/*    @Test
    void testIfNumberIsNegative() {
        int a = -5;

        boolean result = UnitTest.isPositiv(a);

        assertFalse(result);
    }*/
}
