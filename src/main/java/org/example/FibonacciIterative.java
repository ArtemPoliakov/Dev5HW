package org.example;

public class FibonacciIterative {
    public long doSomeFibonacciStuff(int n) {
        if (n <= 1) {
            return n;
        }
        long[] lastTwo = {0, 1};
        for (int i = 0; i <= n - 2; i++) {
            long temp = lastTwo[0];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] += temp;
        }
        return lastTwo[1];
    }
}
