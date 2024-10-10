public class Cycle2 {
    public static void main(String[] args) {
//        Задача 1
        System.out.println("Задача 1");
        int accumulation = 0;
        int months = 0;

        while (accumulation < 2459000) {
            months += 1;
            accumulation += 15000;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + accumulation + " рублей");
        }
//        Задача 2
        System.out.println("Задача 2");
        byte num = 0;
        while (num < 10) {
            num += 1;
            System.out.print(" " + num);
        }
        System.out.println();
        while (num > 0) {
            System.out.print(" " + num);
            num -= 1;
        }
        System.out.println();
//        Задача 3
        System.out.println("Задача 3");
        int year = 2024;
        int nowPeople = 12000000;

        do {
            int borringPeople = (17 * nowPeople) / 1000;
            int deathPeople = (8 * nowPeople) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + nowPeople);
            year += 1;
            nowPeople = nowPeople - deathPeople + borringPeople;
        } while (year < 2035);
//        Задача 4
        System.out.println("Задача 4");
        int sum = 0;
        int month = 0;
        do {
            month += 1;
            sum += (int) (15000 * 0.7);
            System.out.println("Месяц " + month + ", сумма накопленрий: " + sum);
        } while (sum < 12000000);
//        Задача 5
        System.out.println("Задача 5");
        sum = 0;
        month = 0;
        do {
            month += 1;
            sum += (int) (15000 * 0.7);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопленрий: " + sum);
            }
        } while (sum < 12000000);
//        Задача 6
        System.out.println("Задача 5");
        sum = 0;
        month = 0;
        int years = 0;

        do {
            month += 1;
            sum += (int) (15000 * 0.7);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопленрий: " + sum);
            }
            if (month == 12) {
                years += 1;
                month = 0;
            }
        } while (years < 10);
//        Задача 7
        System.out.println("Задача 7");
        int friday = 5;
        int dayOfMonth = 1;
        while (dayOfMonth < 31) {
            if (dayOfMonth % 5 == 0) {
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет!");
            }
            dayOfMonth += 1;
        }
//        Задача 8
        System.out.println("Задача 8");
        int yearOfComet = 1;
        while (yearOfComet < 301) {
            if (yearOfComet % 79 == 0) {
                if (yearOfComet < 200) {
                    System.out.println("Комета пролетала в " + yearOfComet + " году");
                } else {
                    System.out.println("Комета пролетит в " + yearOfComet + " году");
                }
            }
            yearOfComet += 1;
        }
    }
}
