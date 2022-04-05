package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача №1
        byte a = 3;
        short b = 7;
        int age = 11;
        long d = 17L;
        float e = 2.5f;
        double f = 7.3;
        char g = 64;
        System.out.println("@ = " + g);
        boolean i = age >= 18;
        System.out.println(i);

    // Задача №2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров: " + totalWeight + " кг.");
        System.out.println("Разница в весе боксеров: " + weightDifference + " кг.");

    // Задача №3
        short banana = 5;
        short bananaWeight = 80; // вес ингредиентов в граммах
        short milk = 200; // милилитры
        short milkWeight = 105; // вес 100 мл. в граммах
        short milkWeightMilliliters = 100;
        short iceCream = 2;
        short iceCreamWeight = 100;
        short eggs =  4;
        short eggsWeight = 70;
        int bananaTotal = banana * bananaWeight;
        int milkTotal = milk * milkWeight / milkWeightMilliliters;
        int iceCreamTotal = iceCream * iceCreamWeight;
        int eggsTotal = eggs * eggsWeight;
        float sportBreakfast = bananaTotal + milkTotal + iceCreamTotal + eggsTotal;
        short gram = 1000;
        float sportBreakfastKg = sportBreakfast / gram;
        System.out.println("Вес спортивного завтрака " + sportBreakfastKg + " кг.");

    // Задача №4
        byte excessWeight = 7;
        short kg = 1000;
        short weightLoos1 = 250;
        short weightLoos2 = 500;
        int excessWeightKilogram = excessWeight * kg;
        int totalDay250g = excessWeightKilogram / weightLoos1;
        int totalDay500g = excessWeightKilogram / weightLoos2;
        int totalDayAverage = (totalDay250g + totalDay500g) / 2;

        System.out.println("Худея по 250 грамм в день потребуется: " + totalDay250g + " дней");
        System.out.println("Худея по 500 грамм в день потребуется: " + totalDay500g + " дней");
        System.out.println("В среднем для похудения потребуется: " + totalDayAverage + " день");

    // Задача №5
        float incomeMonthMasha = 67_760f;
        float incomeMonthDenis = 83_690f;
        float incomeMonthKristina = 76_230f;
        byte percent100 = 100;
        byte percent10 = 10;
        byte month = 12;
            // Годовой доход сотрудников до повышения зарплаты
        float incomeYearMasha = incomeMonthMasha * month;
        float incomeYearDenis = incomeMonthDenis * month;
        float incomeYearKristina = incomeMonthKristina * month;
            // Месячная зарплата после повышения на 10%
        float incomeNewMonthMasha = ((incomeMonthMasha / percent100) * percent10) + incomeMonthMasha;
        float incomeNewMonthDenis = ((incomeMonthDenis / percent100) * percent10) + incomeMonthDenis;
        float incomeNewMonthKristina = ((incomeMonthKristina / percent100) * percent10) + incomeMonthKristina;
            // Годовой доход после повышения зарплаты
        float incomeNewYearMasha = incomeNewMonthMasha * month;
        float incomeNewYearDenis = incomeNewMonthDenis * month;
        float incomeNewYearKristina = incomeNewMonthKristina * month;
            // Разница в годовом доходе до и после повышения
        float differentYearMasha = incomeNewYearMasha - incomeYearMasha;
        float differentYearDenis = incomeNewYearDenis - incomeYearDenis;
        float differentYearKristina = incomeNewYearKristina - incomeYearKristina;

        System.out.println("Месячный доход Маши стал: " + incomeNewMonthMasha +
                            " p. доход вырос на: " + differentYearMasha + "р.");

        System.out.println("Месячный доход Дениса стал: " + incomeNewMonthDenis +
                           " p. доход вырос на: " + differentYearDenis + "р.");

        System.out.println("Месячный доход Кристины стал: " + incomeNewMonthKristina +
                            " p. доход вырос на: " + differentYearKristina + "р.");

    }
}
