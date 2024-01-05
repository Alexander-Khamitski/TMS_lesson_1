package org.example;

import java.util.Scanner;

public class Task4 {
    /**
     * Задача 4:
     * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
     * программу, округляющую число n до ближайшего целого и выводящую результат на
     * экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number with non-zero fractional part: ");
        double numberWithNonFractionalPart = scanner.nextDouble();
        scanner.close();

        if (Double.isFinite(numberWithNonFractionalPart)) {
            System.out.println("Here is rounded number: " + Math.round(numberWithNonFractionalPart));
        } else {
            System.out.println("You entered not a number with non-zero fractional part: " + numberWithNonFractionalPart);
        }
    }
}
