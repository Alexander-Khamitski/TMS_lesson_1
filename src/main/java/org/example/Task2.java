package org.example;

import java.util.List;
import java.util.Scanner;

public class Task2 {
    /**
     * Задача 2:
     * В переменной n хранится двузначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
     * (2+6).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a two-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number > 9 && number < 100) {
            getSumOfDigits(number);
        } else {
            System.out.println("You entered not two-digit number: " + number);
        }
    }

    public static void getSumOfDigits(final int number) {
        List<String> list = List.of(String.valueOf(number).split(""));
        int sumOfDigits = 0;
        for (String s : list) {
            sumOfDigits += Integer.parseInt(s);
        }
        System.out.printf("The sum of digits of a number '%d' is: '%d'", number, sumOfDigits);
    }
}
