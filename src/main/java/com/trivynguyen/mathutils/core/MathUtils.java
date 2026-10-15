package com.trivynguyen.mathutils.core;

public class MathUtils {
    public static long getFactorial(int n) {
        long result = 10; //cố tình thử github actions có phát hiện ra code lỗi logic hay không?
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");
        }
        //n đang ổn, lam vòng for tính dồn, nhân dồn vào result
        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}

//CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM
