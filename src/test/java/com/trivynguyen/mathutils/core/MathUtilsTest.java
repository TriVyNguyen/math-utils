package com.trivynguyen.mathutils.core;

import org.junit.jupiter.api.Test;

import static com.trivynguyen.mathutils.core.MathUtils.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    //TEST CASE 1: TEST HÀM VỚI VALID INPUT, N = 6, EXPECTED RESULT = 720
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay không
        //nếu == thì màu xanh
        //nếu != thì màu đỏ
        assertEquals(expected, actual);
    }

    //TEST CASE 2: TEST HÀM VỚI VALID INPUT, N = 5, EXPECTED RESULT = 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay không
        //nếu == thì màu xanh
        //nếu != thì màu đỏ
        assertEquals(expected, actual);
    }

    //TEST CASE 3: TEST HÀM VỚI VALID INPUT, N = 0, EXPECTED RESULT = 1
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay không
        //nếu == thì màu xanh
        //nếu != thì màu đỏ
        assertEquals(expected, actual);
    }

    //TEST CASE 4: TEST HÀM VỚI INVALID INPUT, N = -1, HY VỌNG TRẢ VỀ NGOẠI LỆ!!!
    //IllegalArgumentException
    @Test
    void testFactorialGivenValidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial(-1);});
    }
}