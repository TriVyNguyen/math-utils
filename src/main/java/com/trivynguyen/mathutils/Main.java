package com.trivynguyen.mathutils;

import com.trivynguyen.mathutils.core.MathUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //TDD - VIẾT CODE BẮT ĐẦU TỪ VIẾT TEST
        testFactorialGivenValidN5ReturnsWell120();
    }

    //test hàm tính giai thừa với n = 5 và hy vọng trả về 120
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtils.getFactorial(n);

        //sout tab
        System.out.println("Check 5! | expected: " + expected + " | actual: " + actual);
    }
}

//CODE NÀY DÙNG ĐỂ TEST CODE BASE, ĐƯỢC GỌI LÀ TEST SCRIPT
//CODE NÀY VỀ LÝ THUYẾT KHÔNG CẦN SHIP CHO KHACH HÀNG
