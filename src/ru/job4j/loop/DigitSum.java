package ru.job4j.loop;

/*Дано число, нужно получить сумму его цифр*/
public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}

