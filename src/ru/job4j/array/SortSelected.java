package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            if (data[0] != data[i]) {
                int temp = data[index];
                data[index] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }
}