package HomeWork4;
/*
Создайте массив целых чисел. Напишете программу, которая
выводит сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */

import java.util.Scanner;

public class CreateAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 33, 5, 7, 9, 12, 44, 56, 76, 888};
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number for check array: ");
        int num = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                System.out.println("Congratulations !! number " + num + " is in the array");
                break;
            }

        }
        if (!found){
            System.out.println("There is no such number");
    }
}
}

