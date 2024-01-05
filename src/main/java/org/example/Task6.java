package org.example;

import java.util.Scanner;

public class Task6 {
    /**
     * Задача 6:
     * Написать программу которая будет менять местами значение целочисленных
     * переменных. Пример:
     * int a = 1; int b = 2;
     * //код (ваше решение)
     * sout(a); //выведет 2
     * sout(b); //выведет 1
     * Усовершенствовать программу, использовать только 2 входные переменные (a,b);
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 'a': ");
        int a = scanner.nextInt();
        System.out.println("'a': " + a);
        System.out.println("Please, enter 'b': ");
        int b = scanner.nextInt();
        System.out.println("'b': " + b);
        scanner.close();
        //a=5
        //b=7
        a += b; //a=12
        b = a - b; //b=5
        a -= b; //a=7
        System.out.println("'a': " + a);
        System.out.println("'b': " + b);
    }
}
