package com.javalesson.chapter1.task3;


/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * <p>
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 * <p>
 * Вам нужно выполнить задания двумя способами.
 */

import java.util.Scanner;

public class PalindromeFinderTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Please enter 5 numbers");

        while (scan.hasNextInt()) {
            number = scan.nextInt();

            if (getCountsOfDigits(number) == 5) {
                System.out.println(isPalindrome(number));
                break;
            }
            System.out.println("Try again");
        }

    }

    private static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private static boolean isPalindrome(int input) {
        String text = String.valueOf(input); //или Integer.toString(input);
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    /*private static boolean isPalindrome(int input) { //Сравнение с реверсной строкой
        String textInput = Integer.toString(input);
        String invertInput = "";

        for (int i = textInput.length(); i > 0; i--) {
            invertInput += textInput.charAt(i - 1);
        }
        return textInput.equals(invertInput);

    }*/


        /*Scanner in = new Scanner(System.in); //вариант со String и сравнение с реверсной строкой
        String text;


        while (true) {
            System.out.println("Please enter 5 numbers");
            text = in.nextLine();
            if (text.length() == 5 && isNumber(text)) {
                System.out.println(isPalindrome(text));
                break;
            }
            System.out.println("Try again");
        }

    }


    private static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ignore) {
            return false;
        }
    }

    private static boolean isPalindrome(String text) {

        String invertInput = "";

        for (int i = text.length(); i > 0; i--) {
            invertInput += text.charAt(i - 1);
        }

        return text.equals(invertInput);

    }*/

}

