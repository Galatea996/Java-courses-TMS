package HomeWork5;
/*
Создать трехмерный массив из целых чисел. С помощью
циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли.
 */

import java.util.Scanner;

public class Create3DArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int incrementValue = num;
        int[][][] mas = new int[][][]{
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        for (int i = 0; i < mas.length; i++) {

            for (int j = 0; j < mas[i].length; j++) {

                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] += incrementValue;
                }
                System.out.println();
            }
            for (int[][] a : mas) {
                for (int[] b : a) {
                    for (int c : b) {
                        System.out.print(c + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

