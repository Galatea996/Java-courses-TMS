/*
Напишите программу, которая будет принимать на вход
число и на выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2').
 */

import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temp: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            //int temp = t % 2;
            System.out.println("Number " + num + " even!");
        } else {
            System.out.println("Number " + num + " not even!");
        }
    }
}
