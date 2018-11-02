package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class FiboCalculatorTest {

    @Test
    public void testFiboSuccessionArrayResult() {
        FiboCalculator fibo = new FiboCalculator(6);
        int[] result = {0,1,1,2,3,5};
        Assert.assertArrayEquals(result, fibo.getFibonacciSuccession("d"));
    }

    @Test
    public void testFiboSuccessionArrayResultWithValueZero() {
        FiboCalculator fibo = new FiboCalculator(0);
        int[] result = new int[0];
        Assert.assertArrayEquals(result, fibo.getFibonacciSuccession("d"));
    }

    @Test
    public void testFiboSuccessionArrayInverseResultWithValueZero() {
        FiboCalculator fibo = new FiboCalculator(0);
        int[] result = new int[0];
        Assert.assertArrayEquals(result, fibo.getFibonacciSuccession("i"));
    }

    @Test
    public void testFiboSuccessionArrayInverseResult() {
        FiboCalculator fibo = new FiboCalculator(6);
        int[] result = {5,3,2,1,1,0};
        Assert.assertArrayEquals(result, fibo.getFibonacciSuccession("i"));
    }

    @Test
    public void testGetTotalWhenValue() {
        FiboCalculator fibo = new FiboCalculator(6);
        Assert.assertEquals(12, fibo.getTotal());
    }

    @Test
    public void testGetTotalWhenValueIsZero() {
        FiboCalculator fibo = new FiboCalculator(0);
        Assert.assertEquals(0, fibo.getTotal());
    }
}
