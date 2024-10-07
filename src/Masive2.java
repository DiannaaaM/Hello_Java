public class Masive2 {
    public static void main(String[] args) {
//        Задача 1
        int[] expenses = new int[5];
        expenses[0] = 1000;
        expenses[1] = 2000;
        expenses[2] = 1500;
        expenses[3] = 3000;
        expenses[4] = 2500;
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
//        Задача 2
        int[] trati = {500, 1000, 1500, 3000, 50};
        int mini = 0;
        int maxi = 0;
        for (int i = 0; i < trati.length - 1; i++) {
            if (trati[i] < trati[i + 1]) {
                mini = trati[i];
            } else {
                mini = trati[i + 1];
            }
            if (trati[i] > trati[i + 1]) {
                maxi = trati[i];
            } else {
                maxi = trati[i + 1];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + mini + " рублей. Максимальная сумма трат за неделю составила " + maxi + " рублей");
//        Задача 3
        int[] cash = {1700, 2320, 500, 880, 3000};
        int all = 0;
        for (int i = 0; i < cash.length; i++) {
            all += cash[i];
        }
        all =  all / 5;
        System.out.println("Средняя сумма трат за месяц составила " + all + " рублей");
//        Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right)
        {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;

            left++;
            right--;
        }
        System.out.println(reverseFullName);
    }
}
