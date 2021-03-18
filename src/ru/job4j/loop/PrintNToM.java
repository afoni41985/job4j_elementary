package ru.job4j.loop;

/*Выведите на консоль числа от N до M. M не входит. В этом упражнении используйте цикл for c index.*/
public class PrintNToM {
    public static void out(int n, int m) {
        for (int index = n; index < m; index++) {
            System.out.println(index);
        }
    }
}
