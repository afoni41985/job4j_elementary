package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int dollars = Converter.rubleToDollar(140);
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + dollars + " dollar");
        System.out.println("140 rubles are " + euro + " euro.");

        int inDollar = 140;
        int expectedRubleToDollar = 2;
        int outD = Converter.rubleToDollar(inDollar);
        boolean passed = expectedRubleToDollar == outD;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inEuro = 140;
        int expectedRubleToEuro = 2;
        int outE = Converter.rubleToEuro(inEuro);
        boolean result = expectedRubleToEuro == outE;
        System.out.println("140 rubles are 2. Test result : " + result);
    }
}
