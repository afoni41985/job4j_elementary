package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Метод принимает массив целочисленных значений.
 Необходимо перебрать этот массив выбрать из него только нечетные числа и вернуть новый массив,
 в котором будут только нечетные числа.
 При этом длина нового массива должна совпадать с количеством нечетных значений в исходном массиве.
 */
public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] array = new int[data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                array[count++] = data[i];
            }
        }
        array = Arrays.copyOf(array, count);
        return array;
    }
}

