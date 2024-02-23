package org.nikita;

public class FindMax {

    int a;
    int b;
    int c;

    static void maxNumFrom2(int a, int b){
        if (a > b){
            System.out.println("Максимальное число: " + a);
        } else {
            System.out.println("Максимальное число: " + b);
        }
    }

    int d;
    int e;
    int g;
    static void maxNumFrom3(int d, int e, int g){
        if (d > e && d > g){
            System.out.println("Максимальное число: " + d);
        } else if (e > g) {
            System.out.println("Максимальное число: " + e);
        } else {
            System.out.println("Максимальное число: " + g);
        }
    }


    public static void main(String[] args) {
        FindMax.maxNumFrom2(10,2);
        System.out.println("--------");
        FindMax.maxNumFrom3(2,22,10);
    }
}
