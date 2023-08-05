/*
Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного  пользователем числа. Для ввода числа воспользуйтесь
классом Scanner.
 */

import java.util.Scanner;
public class SummAllNamber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i <= num; i++) {
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
