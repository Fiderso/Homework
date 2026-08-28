public class Main {
    public static void main(String[] args) {

        byte num1 = 120; // Задача 1
        short num2 = 30000;
        int num3 = 1232123;
        long num4 = 1000000000;

        float num5 = 10.37f;
        double num6 = 23.5423;
        System.out.println("Значение переменной num1 с типом byte равно " + num1);
        System.out.println("Значение переменной num2 с типом short равно " + num2);
        System.out.println("Значение переменной num3 с типом int равно " + num3);
        System.out.println("Значение переменной num4 с типом long равно " + num4);
        System.out.println("Значение переменной num5 с типом float равно " + num5);
        System.out.println("Значение переменной num6 с типом double равно " + num6);
        System.out.println();


        double numb1 = 27.12d; // Задача 2
        long numb2 = 987678965549L;
        float numb3 = 2.786f;
        short numb4 = 569;
        short numb5 = -159;
        int numb6 = 27897;
        byte numb7 = 67;


        byte teacherLudmila = 23; // Задача 3
        byte teacherAnna = 27;
        byte teacherCatherine = 30;
        short generalPaper = 480;
        int differencePaper = generalPaper / (teacherLudmila + teacherAnna + teacherCatherine);
        System.out.println("На каждого ученика рассчитано " + differencePaper + " листов бумаги");
        System.out.println();


        short oneMinutes = 8; // Задача 4
        int twentyMinutes = oneMinutes * 20;
        int day = oneMinutes * 60 * 24;
        int threeDays = day * 3;
        long oneMonth = day * 30;
        System.out.println("За 1 минуту машина произвела " + oneMinutes + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");
        System.out.println();


        int total = 120; // Задача 5
        int whitePaint = 2;
        int brownPaint = 4;
        int cansClass = whitePaint + brownPaint;

        int classes = total / cansClass;
        int whiteCans = classes * whitePaint;
        int brownCans = classes * brownPaint;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
        System.out.println();


        byte oneBanana = 80; // Задача 6
        int weightBananas = oneBanana * 5;
        byte onehundredmlMilk = 105;
        int twohundredmlMilk = onehundredmlMilk * 2;
        byte onebriquetteIcecream = 100;
        int twobriquetteIcecream = onebriquetteIcecream * 2;
        byte oneEgg = 70;
        int fourEgg = oneEgg * 4;
        float totalGrams = weightBananas + twohundredmlMilk + twobriquetteIcecream + fourEgg;
        float totalKg = totalGrams / 1000;
        System.out.println("Общий вес завтрака: " + totalGrams + " грамм");
        System.out.println("или");
        System.out.println("Вес завтрака: " + totalKg + " килограмм");
        System.out.println();


        int needKg = 7; // Задача 7
        int needGrams = needKg * 1000;
        int minDay = 250;
        int maxDay = 500;
        int daysMin = needGrams / minDay;
        int daysMax = needGrams / maxDay;
        int daysAverage = (daysMin + daysMax) / 2;

        System.out.println("При потере 250 г/день потребуется: " + daysMin + " дней");
        System.out.println("При потере 500 г/день потребуется: " + daysMax + " дней");
        System.out.println("В среднем потребуется: " + daysAverage + " дней");
        System.out.println();


        int mashaSalary = 67760; // Задача 8
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        float mashaDiff = mashaSalary * 1.1f;
        float denisDiff = denisSalary * 1.1f;
        float kristinaDiff = kristinaSalary * 1.1f;

        float mashaRaz = mashaDiff - mashaSalary;
        float denisRaz = denisDiff - denisSalary;
        float kristinaRaz = kristinaDiff - kristinaSalary;

        float yearMasha = mashaDiff * 12;
        float yearDenis = denisDiff * 12;
        float yearKristina = kristinaDiff * 12;

        System.out.println("Маша получала " + mashaSalary + " рублей в месяц. Месячный доход вырос до " + mashaDiff + " рублей, разница между месячными доходами состовила " + mashaRaz + " рублей. \nПри этом общий годовой доход Маши с учетом увелечения состовляет: " + yearMasha + " рублей.");
        System.out.println("Денис получал " + denisSalary + " рублей в месяц. Месячный доход вырос до " + denisDiff + " рублей, разница между месячными состовила доходами " + denisRaz + " рублей. \nПри этом общий годовой доход Дениса с учетом увелечения состовляет: " + yearDenis + " рублей.");
        System.out.println("Кристина получала " + kristinaSalary + " рублей в месяц. Месячный доход вырос до " + kristinaDiff + " рублей, разница месячнами доходами состовила " + kristinaRaz + " рублей. \nПри этом общий годовой доход Кристины с учетом увелечения состовляет: " + yearKristina + " рублей.");
        System.out.println();
    }
}