package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class FibonacciIterativeTest {
    FibonacciIterative fibonacciIterative;
    @BeforeEach
    void setUp(){
        fibonacciIterative = new FibonacciIterative();
    }

    @ParameterizedTest(name = "test for {0} = {1}")
    @CsvSource(value = {"0,0","1,1","2,1","3,2","4,3","5,5","6,8","7,13","8,21"})
    void TestDoSomeIterativeFibonacciStuff(int n, long expected) {
        long real = fibonacciIterative.doSomeFibonacciStuff(n);
        Assertions.assertEquals(expected, real);
    }
}