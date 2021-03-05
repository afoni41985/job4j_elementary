package ru.job4j.caculate;

import org.junit.Test;

import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X1Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then10() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 10;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then11() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 11;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then12() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 12;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then13() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 13;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}