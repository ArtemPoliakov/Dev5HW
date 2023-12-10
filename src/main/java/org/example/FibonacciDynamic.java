package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    private Map<Integer, Long> memo = new HashMap<>();
    public long doSomeFibonacciStuff(int n) {
        if (n <= 1) {
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        long result = doSomeFibonacciStuff(n - 1) + doSomeFibonacciStuff(n - 2);
        memo.put(n, result);
        return result;
    }
}