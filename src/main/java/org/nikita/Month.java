package org.nikita;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядковый номер месяца: ");
        int numberOMonth = scanner.nextInt();
        MonthCalc.countDaysOfMonth(numberOMonth);

    }

}

class MonthCalc {

    int numberOMonth;

    MonthCalc(int numberOMonth) {
        this.numberOMonth = numberOMonth;
    }

    public static void countDaysOfMonth(int days) {
        switch (days) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("В этом месяце, в 2015 году был 31 день!");
                break;
            case 2:
                System.out.println("В этом месяце, в 2015 году было 28 дней!");
                break;
            default:
                System.out.println("В этом месяце, в 2015 году было 30 дней!");
        }
    }
}