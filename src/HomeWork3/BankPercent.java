package HomeWork3;

import java.util.Scanner;

public class BankPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input deposit amount: ");
        float summ = scanner.nextFloat();
        System.out.println("Input number of months: ");
        int munth = scanner.nextInt();
        for (int i = 1; i <= munth; i++) {
            summ = (float) ((float)summ + (summ * 0.07));
        }
        System.out.println(summ);
    }
}