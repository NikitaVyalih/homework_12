package org.nikita;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        YearVis.visOpr(year);
    }


}

class YearVis{

    int year;

    static void visOpr(int year){
        if (year < 1584){
            System.out.println("Определить невозможно");
        } else if (year % 400 == 0 ) {
            System.out.println(year + " является високосным годом.");
        } else if (year % 4 == 0 ){
            System.out.println(year + " является високосным годом.");
        } else if (year % 100 == 0){
            System.out.println(year + " является невисокосным годом.");
        } else {
            System.out.println(year + " является невисокосным годом.");
        }
    }

}
