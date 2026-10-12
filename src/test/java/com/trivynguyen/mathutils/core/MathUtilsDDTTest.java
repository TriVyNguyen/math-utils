package com.trivynguyen.mathutils.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsDDTTest {

    //chuẩn bị riêng data test ra 1 chỗ - DDT - DATA DRIVEN TESTING
    public static Object[][] initTestData() {
        Object[][] testData = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
        return testData;
    }

    //test nè, nhồi hàm data ở trên vào hàm assertEquals()
    @ParameterizedTest     //sánh ngang vai với DDT
    @MethodSource("initTestData")
    public void testFactorialGivenValidRunsWell(int n, long expected) {
       assertEquals(expected, MathUtils.getFactorial(n));
    }

}