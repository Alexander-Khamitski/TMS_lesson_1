package org.example;

import java.util.Scanner;

public class Task1 {
    /**
     * Задача 1:
     * Написать приложение, которое будет вычислять и выводить значение по формуле:
     * a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter b: ");
        int b = scanner.nextInt();

        System.out.println("Please, enter c: ");
        int c = scanner.nextInt();
        scanner.close();

        double a = 4 * (Double.parseDouble(String.valueOf(b)) + Double.parseDouble(String.valueOf(c)) - 1) / 2;
        System.out.println("'a' value is: " + a);
    }
}
