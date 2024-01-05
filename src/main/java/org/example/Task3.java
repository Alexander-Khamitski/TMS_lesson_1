package org.example;

import java.util.Scanner;

public class Task3 {
    /**
     * Задача 3:
     * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
     * 9 (1+2+6).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a three-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number > 99 && number < 1000) {
            Task2.getSumOfDigits(number);
        } else {
            System.out.println("You entered not three-digit number: " + number);
        }
    }
}
