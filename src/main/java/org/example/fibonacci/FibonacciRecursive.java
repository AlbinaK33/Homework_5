package org.example.fibonacci;

public class FibonacciRecursive {

    public int fibonacciRecursiveMethod(int n) {
        if (n <= 1)
            return n;

        return fibonacciRecursiveMethod(n-1) + fibonacciRecursiveMethod(n-2);
    }
}

/*
  Space complexity: O(n)
  Time complexity: O(2^n)
 */
