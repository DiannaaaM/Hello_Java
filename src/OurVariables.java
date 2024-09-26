public class OurVariables {
    public static void main(String[] args) {
//        Задача 1
        int integer = 1000000;
        System.out.println("Значение переменной 'integer' с типом 'int' равно " + integer);
        byte bytes = 5;
        System.out.println("Значение переменной 'bytes' с типом 'byte' равно " + bytes);
        short shorting = 25047;
        System.out.println("Значение переменной 'shorting' с типом 'short' равно " + shorting);
        long longer = 565215315;
        System.out.println("Значение переменной 'longer' с типом 'long' равно " + longer);
        float floater = 1.34F;
        System.out.println("Значение переменной 'floater' с типом 'float' равно " + floater);
        double doubler = -3.014;
        System.out.println("Значение переменной 'doubler' с типом 'double' равно " + doubler);
//        Задача 2
        double doubleItem = 27.12;
        long longItem = 987678965549l;
        float floatItem = 2.786F;
        int intItem = 569;
        short shortItem = -159;
        int intItem2 = 27897;
        byte byteItem = 67;
//        Задача 3
        int allPaper = 480;
        short allStudents = 23 + 27 + 30;
        short oneStudent = 0;
        oneStudent = (short) (allPaper / allStudents);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");
//        Задача 4
        byte twoMinutes = 16;
        System.out.println("За 2 минуты машина произвела 16 штук бутылок");
        short twentyMinutes = 0;
        twentyMinutes = (short) (twoMinutes * 10);
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int oneDay = 0;
        oneDay = (int) (2 * 30 * 24 * twoMinutes);
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        int threeDays = 0;
        threeDays = (int) (oneDay * 3);
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        int oneMounth = 0;
        oneMounth = oneDay * 30;
        System.out.println("За месяц машина произвела " + oneMounth + " штук бутылок");
//        Задача 5
        short allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte oneClassroom = 6;
        byte allClassrooms = 0;
        allClassrooms = (byte) (allPaint / oneClassroom);
        System.out.println("В школе, где " + allClassrooms + " классов, нужно " + (whitePaint * allClassrooms) + " банок белой краски и " + (brownPaint * allClassrooms) + " банок коричневой краски");
//        Задача 6
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int summGrams = bananas + milk + iceCream + eggs;
        int kiloOfRecept = summGrams / 1000;
        System.out.println("Итого грамм: " + summGrams);
        System.out.println("Итого киллограм: " + kiloOfRecept);
//        Задача 7
        int needToDrop = 7 * 1000;
        int gramm250 = needToDrop / 250;
        int gramm500 = needToDrop / 500;
        int averageDays = (gramm250 + gramm500) / 2;
        System.out.println("Если терять каждый день по 250 грамм, то получится: " + gramm250);
        System.out.println("Если терять каждый день по 500 грамм, то получится: " + gramm500);
        System.out.println("Потеря веса в среднем займет " + averageDays + " дней");
//        Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte incrisSalary = 10;
        int newSalaryMasha = (int) (salaryMasha / 10 + salaryMasha);
        int newSalaryDenis = (int) (salaryDenis / 10 + salaryDenis);
        int newSalaryKristina = (int) (salaryKristina / 10 + salaryKristina);
        int differenceMasha = (int) (newSalaryMasha - salaryMasha);
        int differenceDenis = (int) (newSalaryDenis - salaryDenis);
        int differenseKristina = (int) (newSalaryKristina - salaryKristina);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha);
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis);
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenseKristina);

    }
}
