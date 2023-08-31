package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("   Задача 1");
        int cash = 1000000;
        byte cat = 3;
        short checkRestaurant = 10000;
        long books = 100L;
        float a = cat + 1f;
        double b = 0.765;
        System.out.println("Значение переменной cash с типом int равно " + cash);
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной checkRestaurant с типом short равно " + checkRestaurant);
        System.out.println("Значение переменной books с типом long равно " + books);
        System.out.println("Значение переменной a с типом float равно " + a);
        System.out.println("Значение переменной b с типом double равно " + b);

        System.out.println("   Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        short h = -159;
        int i = 27897;
        byte t = 67;
        System.out.println(f + "; " + l + "; " + d + "; " + s + "; " + h + "; " + i + "; " + t);

        System.out.println("   Задача 3");
        int lyudmilaPavlovna = 23;
        int annaSergeyevna = 27;
        int ekaterinaAndreevna = 30;
        int paperAll = 480;
        int all = lyudmilaPavlovna + annaSergeyevna + ekaterinaAndreevna;
        int paper = paperAll /all;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

        System.out.println("   Задача 4");
        int performance = 16/2;
        System.out.println("Производительность в минуту " + performance);
        int min = 20;
        int day = 24 * 60;
        int days = day * 3;
        int month = day * 30;
        int performanceMin = performance * min;
        int performanceDay = performance * day;
        int performanceDays = performance * days;
        int performanceMonth = performance * month;
        System.out.println("За 20 минут машина произвела " + performanceMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + performanceDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performanceDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + performanceMonth + " штук бутылок");

        System.out.println("   Задача 5");
        int dyeClassWhite = 2;
        int dyeClassBrown = 4;
        int dyeClassAll = dyeClassWhite + dyeClassBrown;
        int allDye = 120;
        int room = allDye / dyeClassAll;
        int dyeWhiteAll = dyeClassWhite * room;
        int dyeBrownAll = dyeClassBrown * room;
        System.out.println("В школе, где " + room + " классов, нужно " + dyeWhiteAll + " банок белой краски и " + dyeBrownAll + " банок коричневой краски");

        System.out.println("   Задача 6");
        int weightBanana = 80;
        int weightBananas = weightBanana * 5;
        int weightMilkMl = 105;
        int weightMilk = weightMilkMl * 2;
        int weightIceCream = 100;
        int weightIceCreams = weightIceCream * 2;
        int weightEgg = 70;
        int weightEggs = weightEgg * 4;
        int cocktail = weightBananas + weightMilk + weightIceCreams + weightEggs;
        int cocktailKg = cocktail / 1000;
        System.out.println("Вес такого спорт завтрака " + cocktailKg + " килограмм или " + cocktail + " граммм ");

        System.out.println("   Задача 7");
        int slimMin = 250;
        int slimMax = 500;
        int kg = 1000;
        int slimAll = kg * 7;
        int slimMinDay = slimAll / slimMin;
        int slimMaxDay = slimAll / slimMax;
        int slimMean = (slimMinDay + slimMaxDay) / 2;
        System.out.println(slimMinDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, и " + slimMaxDay + " — если каждый день будет худеть на 500 грамм. В среднем может потребоваться " + slimMean + " дней для достижения результата");

        System.out.println("   Задача 8");
        int salaryMary = 67760;
        int salaryDen = 83690;
        int salaryKristina = 76230;
        float salaryMaryNew = salaryMary + 0.1f * salaryMary;
        float salaryDenNew = salaryDen + 0.1f * salaryDen;
        float salaryKristinaNew = salaryKristina + 0.1f * salaryKristina;
        int salaryMaryYear = salaryMary * 12;
        int salaryDenYear = salaryDen * 12;
        int salaryKristinaYear = salaryKristina * 12;
        float salaryMaryNewYear = salaryMaryNew * 12;
        float salaryDenNewYear = salaryDenNew * 12;
        float salaryKristinaNewYear = salaryKristinaNew * 12;
        float differenceMary = salaryMaryNewYear - salaryMaryYear;
        float differenceDen = salaryDenNewYear - salaryDenYear;
        float differenceKristina = salaryKristinaNewYear - salaryKristinaYear;
        System.out.println("Маша теперь получает " + salaryMaryNew + " рублей. Годовой доход вырос на " + differenceMary + " рублей");
        System.out.println("Денис теперь получает " + salaryDenNew + " рублей. Годовой доход вырос на " + differenceDen + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}
