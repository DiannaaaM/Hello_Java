public class Cycle {
    public static void main(String[] args) {
//        Задача 1
        System.out.println("Задача 1");
        for (int i=1; i<11; i+=1) {
            System.out.print(" " + i);
        }
        System.out.println();
//        Задача 2
        System.out.println("Задача 2");
        for (int i=10; i>0; i-=1) {
            System.out.print(" " + i);
        }
        System.out.println();
//        Задача 3
        System.out.println("Задача 3");
        for (int i=0; i<17; i+=2) {
            System.out.print(" " + i);
        }
        System.out.println();
//        Задача 4
        System.out.println("Задача 4");
        for (int i=10; i>-11; i-=1) {
            System.out.println(i);
        }
//        Задача 5
        System.out.println("Задача 5");
        for (int i=1904; i<2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
//        Задача 6
        System.out.println("Задача 6");
        for (int i=7; i<100; i+=7) {
            System.out.print(" " + i);
        }
        System.out.println();
//        Задача 7
        System.out.println("Задача 7");
        for (int i=1; i<1000; i=i*2) {
            System.out.print(" " + i);
        }
        System.out.println();
//        Задача 8
        System.out.println("Задача 8");
        for (int i=1; i<13; i+=1) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + i * 29000 + " рублей");
        }
//        Задача 9
        System.out.println("Задача 9");
        for (int i=1; i<13; i+=1) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i * 29000) * 1.2 + " рублей");
        }
//        Задача 10
        System.out.println("Задача 10");
        for (int i=1; i<11; i+=1) {
            System.out.print(" " + i*2);
        }
    }
}
