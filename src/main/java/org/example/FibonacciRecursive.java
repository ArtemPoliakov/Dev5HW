package org.example;

public class FibonacciRecursive {
    public long doSomeFibonacciStuff(int n) {
        if (n <= 1) {
            return n;
        }
        return doSomeFibonacciStuff(n - 1) + doSomeFibonacciStuff(n - 2);
    }
}
