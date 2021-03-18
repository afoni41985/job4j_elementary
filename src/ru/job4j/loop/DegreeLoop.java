package ru.job4j.loop;

/*Дано целое число a и целое число degree (> 0). Найти a в степени degree: a^degree = a·a· . . . ·a (числа a перемножаются degree раз).*/
public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = a;
        for (int i = 1; i < n; i++) {
            rsl = rsl * a;

        }
        return rsl;
    }
}

