package org.example;

import java.util.Scanner;

public class Task0 {
    /**
     * Задача 0:
     * Написать программу для вывода «Hello <user>» на консоль. Пусть <user>
     * вводиться с консоли, программа должна потребовать ввод <user>.
     * Для чтения с консоли используйте класс Scanner.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter user name: ");
        String userName = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + userName);
    }
}
