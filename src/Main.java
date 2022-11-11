import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }
    public static void main(String[] args) {
        System.out.println("Missison 9.1");
        System.out.println(" ");

        int[] summMonth = generateRandomArray();
        System.out.println(Arrays.toString(summMonth));
        int summMonthAll = 0;
        for (int i = 0; i < summMonth.length; i++) {
            summMonthAll += summMonth[i];
        }
        System.out.println("Сумма трат за месяц составила " + summMonthAll + " рублей");


        System.out.println("Missison 9.2");
        System.out.println(" ");

        int[] spendingDay = generateRandomArray();
        System.out.println(Arrays.toString(spendingDay));

        int maxSpendingDay = -1;
        int minSpendingDay = 200_000; // по факту если я правильно понял,когда нет обозначенного в начальном условии задачи предела от 100_000 до 200_000
        // тут стоит "+бесконечность" ?
        for (int i = 0; i < spendingDay.length; i++)
            if (spendingDay[i] > maxSpendingDay) {
                maxSpendingDay = spendingDay[i];
            } else if (spendingDay[i] < minSpendingDay) {
                minSpendingDay = spendingDay[i];
            }
        System.out.print("Максимальная сумма трат за день составила " + maxSpendingDay + " рублей.");
        System.out.println(" Минимальная сумма трат за день составила " + minSpendingDay + " рублей");

        System.out.println("Missison 9.3");
        System.out.println(" ");
        int[] summMonthToo = generateRandomArray();
        System.out.println(Arrays.toString(summMonthToo));
        double summMonthAllToo = 0;
        for (int i = 0; i < summMonthToo.length; i++)
        {summMonthAllToo += summMonthToo[i];}
        double summMonthAllAverage = summMonthAllToo / (summMonthToo.length-1) ;
        System.out.println("Сумма трат за месяц составила " + summMonthAllToo + " рублей");
        String resultAverage = String.format("%.2f",summMonthAllAverage);
        System.out.println("Средняя сумма трат за месяц составила " + resultAverage+ " рублей");


        System.out.println("Missison 9.4");
        System.out.println(" ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            if (i >= 0) {
                System.out.print(reverseFullName[i]);
            }


    }
}

// THE END