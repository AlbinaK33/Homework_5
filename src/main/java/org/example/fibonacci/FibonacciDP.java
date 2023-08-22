package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {

        private static Map<Integer, Long> memo = new HashMap<>();

        public static long fibonacciDynamicMethod(int n) {
            if (n <= 1) {
                return n;
            }

            if (memo.containsKey(n)) {
                return memo.get(n);
            }

            long fib = fibonacciDynamicMethod(n - 1) + fibonacciDynamicMethod(n - 2);
            memo.put(n, fib);
            return fib;
        }
}
