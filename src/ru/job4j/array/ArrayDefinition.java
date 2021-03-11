package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Ivan Ivanov";
        names[2] = "Oleg Petrov";
        names[3] = "Ivan Cidorov";

        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surname.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
