class Variables {
    public static void main(String[] args) {
//        Задача 1
        var dog = 8.0;
        var cat = 7.6;
        var paper = 763789;
        System.out.println("Изначальные данные:");
        System.out.println("Dog - " + dog);
        System.out.println("Cat - " + cat);
        System.out.println("Paper - " + paper);
//        Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Измененные данные(прибавление к значениям 4):");
        System.out.println("Dog - " + dog);
        System.out.println("Cat - " + cat);
        System.out.println("Paper - " + paper);
//        Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Измененные данные(вычитание из значений):");
        System.out.println("Dog - " + dog);
        System.out.println("Cat - " + cat);
        System.out.println("Paper - " + paper);
//        Задача 4
        var friend = 19;
        System.out.println("Новая переменная 'friend' - " + friend);
        friend = friend + 2;
        System.out.println("Увеличение переменной на 2 - " + friend);
        friend = friend / 7;
        System.out.println("Деление переменной на 7 - " + friend);
//        Задача 5
        var frog = 3.5;
        System.out.println("Новая переменная 'frog' - " + frog);
        frog = frog * 10;
        System.out.println("Увеличение переменной в 10 раз - " + frog);
        frog = frog / 3.5;
        System.out.println("Уменьшение переменной в 3.5 раза - " + frog);
        frog = frog + 4;
        System.out.println("Увеличение переменной на 4 - " + frog);
//        Задачи 6 и 7
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Сумма массы 2-х бойцов: " + (boxer1 + boxer2));
        System.out.println("Разница масс 2-х бойцов: " + (boxer2 - boxer1));
        System.out.println("Остаток от деления между масс 2-х бойцов: " + (boxer2 % boxer1));
//        Задача 8
        var hours = 640;
        var worker = 8;
        var workers = hours / worker;
        System.out.println("Всего работников в компании — " + workers);
        workers = workers + 94;
        worker = hours / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + worker);
        }
    }