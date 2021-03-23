package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (lIndex >= left.length) {
                rsl[i] = right[rIndex];
                rIndex += 1;
            } else if (rIndex >= left.length) {
                rsl[i] = left[lIndex];
                lIndex += 1;
            } else if (left[lIndex] < right[rIndex]) {
                rsl[i] = left[lIndex];
                lIndex += 1;
            } else {
                rsl[i] = right[rIndex];
                rIndex += 1;
            }
        }
        return rsl;
    }
}