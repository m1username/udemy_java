package com.javalesson.chapter1.task1;
/**
 * Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 * сторонами треугольника.
 * Для ввода значений с консоли Вам понадобится класс Scanner.
 * <code>Scanner scanner = new Scanner(System.in);</code>
 * <code>scanner.nextInt();</code>
 */

import java.util.Scanner;

public class TriangleTask {

    public static void main(String[] args) {
        System.out.println("Please enter a size of the triangle side");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();

        System.out.println(checkPossibility(k, l, m));
    }
    private static String checkPossibility
            (int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a) {
            return "Triangle exist!";
        }
        return "Triangle doesn't exist!";
    }
}
