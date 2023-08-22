package org.example;

import org.example.fibonacci.FibonacciDP;
import org.example.fibonacci.FibonacciIterative;
import org.example.fibonacci.FibonacciRecursive;

public class App {

    public static void main( String[] args ) {

        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        FibonacciDP fibonacciDP = new FibonacciDP();

        System.out.println(fibonacciIterative.fibonacciIterativeMethod(8));
        System.out.println(fibonacciRecursive.fibonacciRecursiveMethod(8));
        System.out.println(fibonacciDP.fibonacciDynamicMethod(8));
    }
}
