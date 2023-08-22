package org.example.fibonacci;

public class FibonacciIterative {

    public int fibonacciIterativeMethod(int n) {
        if (n <= 1)
            return n;

        int prevPrev = 0;
        int prev = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prevPrev + prev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }
}

 /*
  Space complexity: O(1)
  Time complexity: O(n)
 */