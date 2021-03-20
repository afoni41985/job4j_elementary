package ru.job4j.array;

/* Даны два отсортированных по возрастанию массива.
 Как без сортировки их объединить в третий массив?
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex + rightIndex < rsl.length) {
            if (leftIndex < left.length && left[leftIndex] < right[rightIndex]) {
                rsl[leftIndex + rightIndex] = left[leftIndex++];

            } else {
                rsl[leftIndex + rightIndex] = right[rightIndex++];

            }
        }
        return rsl;
    }
}