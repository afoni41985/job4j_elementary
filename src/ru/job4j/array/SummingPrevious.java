package ru.job4j.array;

import java.util.Arrays;

/* Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n,
первый элемент которого равен a, второй равен b,
 а каждый последующий элемент равен сумме всех предыдущих
 */
public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n]; //выходной массив длиной n
        result[0] = a;
        result[1] = b;
        int sum = a + b;
        // переменная в которой суммируем значения элементов

        for (int i = 2; i < n; i++) {
            // проходим циклом по массиву
            result[i] = sum;
            //в соответствующий элемент записывам значение temp
            sum = sum + result[i];
            // прибавляем к temp текущее значение
        }
        return result;
    }
}
