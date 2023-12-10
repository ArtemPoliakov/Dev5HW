package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciDynamicTest {
    FibonacciDynamic fibonacciDynamic;
    @BeforeEach
    void setUp(){
        fibonacciDynamic = new FibonacciDynamic();
    }

    @ParameterizedTest(name = "test for {0} = {1}")
    @CsvSource(value = {"0,0","1,1","2,1","3,2","4,3","5,5","6,8","7,13","8,21"})
    void TestDoSomeDynamicFibonacciStuff(int n, long expected) {
        long real = fibonacciDynamic.doSomeFibonacciStuff(n);
        Assertions.assertEquals(expected, real);
    }
}