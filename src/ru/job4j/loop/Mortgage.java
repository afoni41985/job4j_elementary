package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double credit = amount + amount * percent / 100;
        while (credit >= 0) {
            double debt = credit - salary;
            credit = debt * percent / 100 + debt;
            year++;
        }
        return year;
    }
}
