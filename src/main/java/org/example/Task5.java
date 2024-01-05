package org.example;

import java.util.Scanner;

public class Task5 {
    /**
     * Задача 5:
     * В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
     * на экран результат деления q на w с остатком.
     * Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
     * 21 / 8 = 2 и 5 в остатке.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 'q': ");
        int q = scanner.nextInt();
        System.out.println("Please, enter 'w': ");
        int w = scanner.nextInt();
        scanner.close();
        int qDividedByW = q / w;
        System.out.println("'q' divided by 'w': " + qDividedByW);
        int reminderOfDivisionQByW = q % w;
        System.out.println("Reminder of division 'q' by 'w': " + reminderOfDivisionQByW);
        System.out.printf("%d / %d = %d and %d as reminder.%n", q, w, qDividedByW, reminderOfDivisionQByW);
        scanner.close();
    }
}
