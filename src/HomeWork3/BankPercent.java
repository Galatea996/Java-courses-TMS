package HomeWork3;
/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и
количество месяцев. А банк вычисляет конечную сумму вклада с учетом
начисления процентов за каждый месяц. Для вычисления суммы с
учетом процентов используйте цикл for. Пусть сумма вклада будет
представлять тип float.
 */
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