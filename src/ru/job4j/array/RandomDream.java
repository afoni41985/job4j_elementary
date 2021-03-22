package ru.job4j.array;

/*Дан массив призов и положительное число, которое сгенерировано случайно. Ваша задача получить приз
Например,
{"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"
{"автомобиль", "квартира", "билет"} и число = 2 => "квартира"
{"автомобиль", "квартира", "билет"} и число = 4 => "автомобиль"
{"автомобиль", "квартира", "билет"} и число = 99 => "билет"
 */
public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = null;
        if (num < 4) {
            num += 4;
        }
        int xxx = num % 4;
        switch (xxx) {
            case 1 -> {
                prize = prizes[0];
            }
            case 2 -> {
                prize = prizes[1];
            }
            case 3 -> {
                prize = prizes[2];
            }
            case 0 -> {
                prize = prizes[3];
            }
            default -> {
                prize = prizes[4];
            }
        }
        return prize;
    }
}



