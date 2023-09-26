package HomeWork4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayGeneration {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size of the array: ");
        int size = scaner.nextInt();
        scaner.nextLine();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(size);
        }
        System.out.print("Created an array of size " + size + " and filled with random numbers:\n");

        for (int num:arr) {
            System.out.print(num + " ");

        }

    }

}
