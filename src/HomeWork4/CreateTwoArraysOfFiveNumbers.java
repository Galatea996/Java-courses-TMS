package HomeWork4;
/*
Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого
массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
 */

import java.util.Random;
import java.util.Scanner;

public class CreateTwoArraysOfFiveNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrOne = new int[5];
        int[] arrTwo = new int[5];
        double resultOne = 0;
        double resultTwo = 0;

        for (int i = 0; i < 5; i++) {
            arrOne[i] = random.nextInt(6);
            arrTwo[i] = random.nextInt(6);
        }
        System.out.print("Arra one: ");
        for (int numOne : arrOne) {
            resultOne += numOne;
            System.out.print(numOne + " ");

        }
        double everageOne = resultOne / arrOne.length;
        System.out.println();
        System.out.println("The arithmetic mean of the result one is: " + everageOne);

        System.out.println();

        System.out.print("Arra two: ");
        for (int numtwo : arrTwo) {
            resultTwo += numtwo;

            System.out.print(numtwo + " ");
        }
        double everageTwo = resultTwo / arrTwo.length;
        System.out.println();
        System.out.println("The arithmetic mean of the result two is: " + everageTwo);

        System.out.println();

        if (everageOne < everageTwo) {
            System.out.println("The arithmetic mean of the result one is- less!");
        } else if (everageOne > everageTwo){
            System.out.println("The arithmetic mean of the result one is- more!");
        } else {
            System.out.println("The arithmetic mean of the result one and two are even");
        }

    }
}

