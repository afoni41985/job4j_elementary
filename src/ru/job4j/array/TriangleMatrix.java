package ru.job4j.array;

import java.util.Arrays;

/*Треугольная матрица, это матрица вида:

1

2 3

4 5 6

Вам дано количество строк в результирующей матрице. Вам нужно заполнить ее.

 */
public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int counter = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = counter++;
            }
        }
        return triangle;
    }
}