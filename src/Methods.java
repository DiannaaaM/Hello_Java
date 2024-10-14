import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        System.out.println(task1(2001));
        System.out.println(task2(1, LocalDate.now().getYear()));
        System.out.println(task3(100));
        }
    public static String task1(int year) {
        String result = "";
        if (year < 1584) {
            result = "Этот год не подходит для проверки";
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                result = year + " является високосным";
            } else {
                result = year + " не является високосным";
            }
        }
        return result;
        }
    public static String task2(int type, int year){
        String result = "";
        if (type == 0) {
            result = "Установите версию приложения для iOS по ссылке";
            if (year < 2015) {
                result = "Установите облегченную версию приложения для iOS по ссылке";
            }
        }
        if (type == 1) {
            result = "Установите версию приложения для Android по ссылке";
            if (year < 2015) {
                result = "Установите облегченную версию приложения для iOS по ссылке";
            }
        }
        return result;
    }
    public static String task3(int distance){
        String result = "";
        if (distance <= 20) {
            result = "Потребуется 1 день доставки";
        }
        if (distance > 20 && distance <= 60) {
            result = "Потребуется 2 дня доставки";
        }
        if (distance > 60 && distance <= 100) {
            result = "Потребуется 3 дня доставки";
        } else {
            result = "Для такого радиуса доставки нет";
        }
        return result;
    }
}
