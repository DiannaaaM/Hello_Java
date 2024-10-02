public class Operators {
    public static void main(String[] args) {
//        Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Не совершеннолетний");
        }
//        Задача 2
        byte temperature = 0;
        if (temperature <= 5) {
            System.out.println("На улице холодно, одень шапку");
        } else {
            System.out.println("Сегодня тепло, можно без шапки");
        }
//        Задача 3
        byte speed = 0;
        if (speed > 60) {
            System.out.println("Плати налоги");
        } else {
            System.out.println("Молодец, продолжай в том же духе");
        }
//        Задача 4
        byte peopleAge = 5;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Иди в садик");
        }
        if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Иди в школу");
        }
        if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Иди в университет");
        }
        if (peopleAge > 24) {
            System.out.println("Иди работай");
        } else {
            System.out.println("Напиши свой возраст правильно :/");
        }
//        Задача 5
        byte childAge = 0;
        if (childAge < 5) {
            System.out.println("Тебе еще нельзя кататься, подрасти");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Ладно, покатайся. Но только со взрослыми, без них нельзя");
        }
        if (childAge >= 14) {
            System.out.println("Ты можешь кататься без взрослых");
        }
//        Задача 6
        byte placeForVan = 15;
        if (placeForVan < 60) {
            System.out.println("Сидячие места еще есть");
        }
        if (placeForVan >= 60 && placeForVan < 102) {
            System.out.println("Сидячих не осталось, но есть стоячие места");
        } else {
            System.out.println("Мест нет вообще, ты опоздал");
        }
//        Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число больше всего");
        }
        if (two > one && two > three) {
            System.out.println("Второе число больше всего");
        }
        if (three > one && three > two) {
            System.out.println("Третье число больше всего");
        } else {
            System.out.println("Числа равны");
        }
    }
}
